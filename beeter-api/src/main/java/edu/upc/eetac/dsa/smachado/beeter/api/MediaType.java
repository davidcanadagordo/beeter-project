package edu.upc.eetac.dsa.smachado.beeter.api;

public interface MediaType {
	//formato de json
		// dson application/vnd.    .+json
		// 4 mediatypes: Usuario, colección usuario, sting y colección sting
		public final static String BEETER_API_USER = "application/vnd.beeter.api.user+json";
		public final static String BEETER_API_USER_COLLECTION = "application/vnd.beeter.api.user.collection+json";
		public final static String BEETER_API_STING = "application/vnd.beeter.api.sting+json";
		public final static String BEETER_API_STING_COLLECTION = "application/vnd.beeter.api.sting.collection+json";
	}



