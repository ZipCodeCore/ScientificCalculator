package com.zipcodewilmington.scientificcalculator;

public class BoxMaker {
    private int width;

    public BoxMaker() {
        width = 30;
    }

    public BoxMaker(int initialWidth)
    {
        width = initialWidth;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int newWidth)
    {
        if(newWidth > 0 && newWidth < 151)
        {
            width = newWidth;
        }
    }

    public String draw(String ... input) {
        StringBuilder output = new StringBuilder();

        output.append("╔");
        for(int i = 0; i < width - 2; i++) {
            output.append("═");
        }
        output.append("╗\n");

        for (String element : input)
        {
            String line = "";
            StringBuilder lineFormat = new StringBuilder();
            lineFormat.append("%");
            lineFormat.append(width - 2);
            lineFormat.append("s");

            line = String.format(lineFormat.toString(), element);
            output.append("║");
            output.append(line);
            output.append("║\n");
        }

        output.append("╚");
        for(int i = 0; i < width - 2; i++) {
            output.append("═");
        }
        output.append("╝\n");

        return output.toString();
    }
}
