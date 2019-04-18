package com.framework.connection;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;
import org.supercsv.cellprocessor.Optional;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvMapWriter;
import org.supercsv.io.ICsvMapWriter;
import org.supercsv.prefs.CsvPreference;

public class CsvWriter {

	public void writeData(String path, CompleteObject info) {
		ICsvMapWriter mapWriter = null;
		ObjectMapper objectMapper = new ObjectMapper();
		Map<String, Object> beanProperties = objectMapper.convertValue(info, Map.class);

		String[] header = new String[beanProperties.size()];
		int headerIndex = 0;
		for (Map.Entry<String, Object> entry : beanProperties.entrySet()) {
			header[headerIndex] = new String(entry.getKey());
			headerIndex++;
		}

		Path orderPath = Paths.get(path);
		try {
			if (Files.exists(orderPath)) {
				mapWriter = new CsvMapWriter(new FileWriter(path, true), CsvPreference.STANDARD_PREFERENCE);
			} else {
				mapWriter = new CsvMapWriter(new FileWriter(path), CsvPreference.STANDARD_PREFERENCE);
				mapWriter.writeHeader(header);
			}
			mapWriter.write(beanProperties, header, getProcessor());
		} catch (IOException e) {
			System.out.println("error occured.....");
		} finally {
			if (mapWriter != null) {
				try {
					mapWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}

	public CellProcessor[] getProcessor() {
		CellProcessor[] processor = new CellProcessor[] {

				new Optional(), new Optional(), new Optional(), new Optional(), new Optional(), new Optional(), new Optional(),
				new Optional(), new Optional(), new Optional(), new Optional(), new Optional(), new Optional()

		};
		return processor;
	}
}
