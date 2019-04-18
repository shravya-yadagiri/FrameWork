package com.framework.connection;

import java.util.List;

public class MainSample {

	public static void main(String[] args) {
		UrlConnectionSample connectionSample = new UrlConnectionSample();
		GsonFrameworkSample framework = new GsonFrameworkSample();
		CsvWriter csvWriter=new CsvWriter();
		Config config = new Config();
		String urlAddress = "https://" + config.getProperty("url") + "/" + config.getProperty("subUrl") + "?"
				+ "series_id=" + config.getProperty("series_id") + "&" + "api_key=" + config.getProperty("api_key")
				+ "&" + "file_type=" + config.getProperty("file_type");
		StringBuffer response = connectionSample.queryHttps(urlAddress);
		CompleteObject completeObjec=framework.getJsonUsingGson(response);
		String path="E:\\completeframe.csv";
		/*
		 * for (Obsertvations obsertvations : obs) { csvWriter.writeData(path,
		 * obsertvations); }
		 */
		 csvWriter.writeData(path, completeObjec);
		System.out.println("written in csv...");
	}
}
