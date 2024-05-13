package lesson26.example01;

public class Item {
    private String name;
    private double price;
    private Properties properties;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
        properties = new Properties();
    }

    // вложеный класс
    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static class Properties {
        private String dateOfManufacture;
        private String expireDate;
        private boolean adultOnly;
        private String color;
        private String material;

        public String getDateOfManufacture() {
            return dateOfManufacture;
        }

        public void setDateOfManufacture(String dateOfManufacture) {
            this.dateOfManufacture = dateOfManufacture;
        }

        public String getExpireDate() {
            return expireDate;
        }

        public void setExpireDate(String expireDate) {
            this.expireDate = expireDate;
        }

        public boolean isAdultOnly() {
            return adultOnly;
        }

        public void setAdultOnly(boolean adultOnly) {
            this.adultOnly = adultOnly;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }
    }
}

