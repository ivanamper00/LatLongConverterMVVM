package com.example.loginsamplemvvm.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PlacesModel {

    @SerializedName("data")
    private List<Datum> data = null;

    public class Datum{
        @SerializedName("latitude")
        private Double latitude;
        @SerializedName("longitude")
        private Double longitude;
        @SerializedName("type")
        private String type;
        @SerializedName("distance")
        private Double distance;
        @SerializedName("name")
        private String name;
        @SerializedName("number")
        private Object number;
        @SerializedName("postal_code")
        private String postalCode;
        @SerializedName("street")
        private String street;
        @SerializedName("confidence")
        private Double confidence;
        @SerializedName("region")
        private String region;
        @SerializedName("region_code")
        private Object regionCode;
        @SerializedName("county")
        private Object county;
        @SerializedName("locality")
        private String locality;
        @SerializedName("administrative_area")
        private Object administrativeArea;
        @SerializedName("neighbourhood")
        private String neighbourhood;
        @SerializedName("country")
        private String country;
        @SerializedName("country_code")
        private String countryCode;
        @SerializedName("continent")
        private String continent;
        @SerializedName("label")
        private String label;

        public Double getLatitude() {
            return latitude;
        }

        public Double getLongitude() {
            return longitude;
        }

        public String getType() {
            return type;
        }

        public Double getDistance() {
            return distance;
        }

        public String getName() {
            return name;
        }

        public Object getNumber() {
            return number;
        }

        public String getPostalCode() {
            return postalCode;
        }

        public String getStreet() {
            return street;
        }

        public Double getConfidence() {
            return confidence;
        }

        public String getRegion() {
            return region;
        }

        public Object getRegionCode() {
            return regionCode;
        }

        public Object getCounty() {
            return county;
        }

        public String getLocality() {
            return locality;
        }

        public Object getAdministrativeArea() {
            return administrativeArea;
        }

        public String getNeighbourhood() {
            return neighbourhood;
        }

        public String getCountry() {
            return country;
        }

        public String getCountryCode() {
            return countryCode;
        }

        public String getContinent() {
            return continent;
        }

        public String getLabel() {
            return label;
        }
    }

    public List<Datum> getData() {
        return data;
    }
}
