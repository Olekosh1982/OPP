package lesson_24.paper;

public class MainPaper {
    public static void main(String[] args) {
        Paper paper=new Paper();
        Pencil pencil=new Pencil();
        Marker marker=new Marker();
        Brush brush=new Brush();
        Pen pen=new Pen();

        paper.drawFigureOnMe("Круг",pencil);
        paper.drawFigureOnMe("Квадрат",brush);
        paper.drawFigureOnMe(" ромб",marker);
        paper.drawFigureOnMe("  что- то",pen);
    }
}
