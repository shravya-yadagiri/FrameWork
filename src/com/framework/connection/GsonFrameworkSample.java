package com.framework.connection;


import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class GsonFrameworkSample {

	
	public CompleteObject getJsonUsingGson(StringBuffer response)
	{
		CompleteObject completeObject=null;
		List<Obsertvations> observations=new ArrayList<Obsertvations>();
		String responseString=response.toString();
		System.out.println("the json parser test started...");
		JsonParser jsonParser = new JsonParser();
		try {
			completeObject=new CompleteObject();
			
			JsonElement rootElement =jsonParser.parse(responseString);
			JsonObject jsonObject = rootElement.getAsJsonObject();
			JsonElement count = jsonObject.get("count");
			JsonElement realtime_start2 = jsonObject.get("realtime_start");
			JsonElement realtime_end2 = jsonObject.get("realtime_end");
			JsonElement observation_start = jsonObject.get("observation_start");
			JsonElement observation_end = jsonObject.get("observation_end");
			JsonElement output_type = jsonObject.get("output_type");
			JsonElement file_type = jsonObject.get("file_type");
			JsonElement order_by = jsonObject.get("order_by");
			JsonElement sort_order = jsonObject.get("sort_order");
			JsonElement limit = jsonObject.get("limit");
			completeObject.setFile_type(file_type.getAsString());
			completeObject.setLimit(limit.getAsInt());
			completeObject.setObservation_end(observation_end.getAsString());
			completeObject.setObservation_start(observation_start.getAsString());
			completeObject.setOrder_by(order_by.getAsString());
			completeObject.setOutput_type(output_type.getAsInt());
			completeObject.setRealtime_end(realtime_end2.getAsString());
			completeObject.setRealtime_start(realtime_start2.getAsString());
			completeObject.setSort_order(sort_order.getAsString());
			
			System.out.println(count);
			completeObject.setCount(count.getAsInt());
			JsonArray jsonArray = jsonObject.getAsJsonArray("observations");
			for (JsonElement jsonElement : jsonArray) {
				// System.out.println("jsonElement....."+jsonElement);
				JsonObject jsonObject2 = jsonElement.getAsJsonObject();
				JsonElement dateElement = jsonObject2.get("date");
				String date = dateElement.getAsString();
				JsonElement valueElement = jsonObject2.get("value");
				String value = valueElement.getAsString();
				JsonElement realtime_startElement = jsonObject2.get("realtime_start");
				String realtime_start = realtime_startElement.getAsString();
				JsonElement realtime_endElement = jsonObject2.get("realtime_end");
				String realtime_end = realtime_endElement.getAsString();
				System.out.println("date...." + jsonObject2.get("date"));
				System.out.println("value..." + jsonObject2.get("value"));
				System.out.println("realtime_start...." + realtime_start);
				System.out.println("realtime_end..." + realtime_end);
				Obsertvations obs=new Obsertvations();
				obs.setDate(date);
				obs.setValue(value);
				obs.setStartTime(realtime_start);
				obs.setEndTime(realtime_end);
				observations.add(obs);
			}
			completeObject.setObservations(observations);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return completeObject;
	}
}
