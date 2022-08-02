package com.rrtrenchf.code;


public class thermometer {

	
		private static int degreesF;
		private static int degreesC;
		private String name;
		
		private int getDegreesF() {
			return degreesF;
		}



		private void setDegreesF(int degreesF) {
			this.degreesF = degreesF;
		}



		private int getDegreesC() {
			return degreesC;
		}



		private void setDegreesC(int degreesC) {
			this.degreesC = degreesC;
		}



		private String getName() {
			return name;
		}



		private void setName(String name) {
			this.name = name;
		}



		private int[] getTempReadings() {
			return tempReadings;
		}



		private void setTempReadings(int[] tempReadings) {
			this.tempReadings = tempReadings;
		}



		private int [] tempReadings = new int [3];
		
		public static double convertToFahrenheit(double c) {
			  c = (degreesC*1.8)+32;
			System.out.println(c);
			return  c;  
			
			
		}
		public static int convertToCelsius(int f) {
			return;
		}
		public static void calculateAvgTemp(int[] temps) {
			
		}

	



}


