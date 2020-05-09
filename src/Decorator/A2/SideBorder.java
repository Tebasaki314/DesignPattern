package Decorator.A2;

public class SideBorder extends Border {
    private char borderChar;
    public SideBorder(Display display, char ch) {
        super(display);
        this.borderChar = ch;
    }

    @Override public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override public int getRows() {
        return display.getRows();
    }

    @Override public String getRowText(int row) {
        StringBuffer buf = new StringBuffer();
        int rowStringLength = display.getRowText(row).getBytes().length;
        int spaceLength = display.getColumns() - rowStringLength;
        buf.append(borderChar).append(display.getRowText(row));
        for (int i = 0; i < spaceLength; i++) {
            buf.append(' ');
        }
        return buf.append(borderChar).toString();
    }
}
