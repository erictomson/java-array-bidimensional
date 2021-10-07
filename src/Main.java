import java.awt.Container;
import javax.swing.JApplet;
import javax.swing.JTextArea;

public class Main extends JApplet {

    // Declarando a TextArea
    JTextArea saidaArea;

    @Override
    public void init() {
        super.init();

        // Instanciando a TextArea
        saidaArea = new JTextArea();
        Container container = getContentPane();
        container.add(saidaArea);

        // Declarando e inicializando os Arrays bidimensionais
        int[][] array1 = { {1,2,3}, {4,5,6} };
        int[][] array2 = { {1,2}, {3}, {4,5,6} };

        saidaArea.setText("Os valores do array1 são\n");
        buildSaida(array1);

        saidaArea.setText("Os valores do array2 são\n");
        buildSaida(array2);
    }

    public void buildSaida(int[][] array) {
        // Percorrendo as linhas do Array com um For
        for(int linha=0; linha<array.length; linha++) {
            // Percorrendo as colunas do Array com outro For
            for(int coluna=0; coluna< array.length; coluna++) {
                saidaArea.append((array[linha][coluna] + " "));
            }
            saidaArea.append("\n");
        }
        saidaArea.append("\n");
    }
}
