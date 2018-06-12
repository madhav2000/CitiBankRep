package com.nt.java;

public class Product {
		private static  String  prodname;
		public static String getProdname() {
			return prodname;
		}
		public static void setProdname(String prodname) {
			Product.prodname = prodname;
		}
		public static String getProdprice() {
			return prodprice;
		}
		public static void setProdprice(String prodprice) {
			Product.prodprice = prodprice;
		}
		private static String prodprice;
}
