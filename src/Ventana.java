import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel Principal;
    private JTextField txtNumero;
    private JButton btnInsertar;
    private JButton btnEliminar;
    private JButton btnConsultar;
    private JTextArea txtListarElemento;
    private JButton btnListar;
    private Pila coleccion=new Pila();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().Principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Ventana() {
        btnInsertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coleccion.insertar(Integer.parseInt(txtNumero.getText()));
                JOptionPane.showMessageDialog(null,"Insertado correctamente");

            }
        });

        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    JOptionPane.showMessageDialog(null, "Eliminado:"+coleccion.eliminar());
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null,ex.getMessage());

                }            }
        });
        btnConsultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    JOptionPane.showMessageDialog(null,"Cima:"+coleccion.consultar());
                }catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
            }
        });
        btnListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtListarElemento.setText((coleccion.toString()));
            }
        });

    }
}
