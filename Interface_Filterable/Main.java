interface Filterable {
    void apply_filter(String type);
    void reset_filter();
}

class ImageProcessor implements Filterable {
    public void apply_filter(String type) {
        System.out.println("Applying " + type + " filter on image");
    }

    public void reset_filter() {
        System.out.println("Image filter reset");
    }
}

class DataAnalyzer implements Filterable {
    public void apply_filter(String type) {
        System.out.println("Applying " + type + " filter on data");
    }

    public void reset_filter() {
        System.out.println("Data filter reset");
    }
}

public class Main {
    public static void main(String[] args) {
        
        // Using ImageProcessor
        Filterable img = new ImageProcessor();
        img.apply_filter("Blur");
        img.reset_filter();

        System.out.println();

        // Using DataAnalyzer
        Filterable data = new DataAnalyzer();
        data.apply_filter("Noise Reduction");
        data.reset_filter();
    }
}