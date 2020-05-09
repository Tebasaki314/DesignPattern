package Decorator.A2;

public class FullBorder extends Border {
    public FullBorder(Display display) {
        super(display);
    }
    @Override public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override public int getRows() {
        return 1 + display.getRows() + 1;
    }

    @Override public String getRowText(int row) {
        if (row == 0) {
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else if (row == display.getRows() + 1) {
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else {
            StringBuffer buf = new StringBuffer();
            int rowStringLength = display.getRowText(row - 1).getBytes().length;
            int spaceLength = display.getColumns() - rowStringLength;
            buf.append("|").append(display.getRowText(row - 1));
            for (int i = 0; i < spaceLength; i++) {
                buf.append(' ');
            }
            return buf.append("|").toString();
        }
    }
    private String makeLine(char ch, int count) {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buf.append(ch);
        }
        return buf.toString();
    }
}
