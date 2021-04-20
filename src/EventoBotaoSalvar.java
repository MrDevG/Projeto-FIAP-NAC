import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;

public class EventoBotaoSalvar implements ActionListener {

    private String Titulo;
    private String Sinopse;
    private String Genero;

    public EventoBotaoSalvar(String titulo, String sinopse, String genero){
        this.Titulo = titulo;
        this.Sinopse = sinopse;
        this.Genero = genero;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(Titulo + "\n" + Sinopse + "\n" + Genero);
    }

/*    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ("progress".equals(evt.getPropertyName())) {
            int value = (int) evt.getNewValue();
            Titulo.set(value);
        } else if ("state".equals(evt.getPropertyName())) {
            if (evt.getNewValue() == SwingWorker.StateValue.DONE) {
                Download download = (Download) evt.getSource();
                try {
                    download.get();
                } catch (InterruptedException | ExecutionException e) {
                    // TODO: handle exceptions here
                    e.printStackTrace();
                }
            }
        }
    }*/
}
