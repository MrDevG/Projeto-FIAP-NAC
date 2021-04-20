import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Home extends JFrame {

    private JPanel contentPane, estrela, panel;
    private JTextField textoSinopse, textoTitulo;

    private JCheckBox checkBoxAssistido;
    private Button botaoSalvar, botaoCancelar;
    private JLabel titulo, sinopse, genero, ondeAssistir, avaliacao, lbl_close, label;
    private JRadioButton circulo, circulo1, circulo2, circulo3;
    private JTabbedPane aba;
    private JComboBox generoComboBox;

    int xx,xy;

    /**
     * Create the frame.
     */
    public Home() {

        aba = new JTabbedPane();
        setBackground(Color.BLACK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 900, 500);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(238, 238, 238));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        panel.setBounds(0, 0, 346, 550);
        contentPane.add(panel);
        panel.setLayout(null);

        label = new JLabel("");
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                xx = e.getX();
                xy = e.getY();
            }
        });
        label.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent arg0) {

                int x = arg0.getXOnScreen();
                int y = arg0.getYOnScreen();
                Home.this.setLocation(x - xx, y - xy);
            }
        });
        label.setBounds(-60, 0, 420, 550);
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setIcon(new ImageIcon(Home.class.getResource("bg.jpeg")));
        panel.add(label);

        botaoSalvar = new Button("Salvar");
        botaoSalvar.setForeground(Color.WHITE);
        botaoSalvar.setBackground(new Color(241, 57, 83));
        botaoSalvar.setBounds(393, 363, 150, 36);
        contentPane.add(botaoSalvar);

        botaoCancelar = new Button("Cancelar");
        botaoCancelar.setForeground(Color.WHITE);
        botaoCancelar.setBackground(new Color(241, 57, 83));
        botaoCancelar.setBounds(554, 363, 150, 36);
        contentPane.add(botaoCancelar);

        textoTitulo = new JTextField();
        textoTitulo.setBounds(395, 83, 309, 36);
        textoTitulo.setText(textoTitulo.getText());
        contentPane.add(textoTitulo);

        titulo = new JLabel("TITULO");
        titulo.setBounds(395, 58, 114, 14);
        contentPane.add(titulo);

        sinopse = new JLabel("SINOPSE");
        sinopse.setBounds(395, 132, 54, 14);
        contentPane.add(sinopse);

        textoSinopse = new JTextField(20);
        textoSinopse.setText(textoSinopse.getText());
        textoSinopse.setColumns(10);
        textoSinopse.setBounds(395, 157, 309, 36);
        contentPane.add(textoSinopse);

        genero = new JLabel("GENERO");
        genero.setBounds(395, 204, 96, 14);
        contentPane.add(genero);

        String[] GeneroCombo = {"", "Ação", "Aventura", "Comédia", "Drama"};
        generoComboBox = new JComboBox(GeneroCombo);
        generoComboBox.setBounds(395, 230, 309, 36);
        contentPane.add(generoComboBox);

        ondeAssistir = new JLabel("ONDE ASSISTIR");
        ondeAssistir.setBounds(750, 58, 114, 14);
        contentPane.add(ondeAssistir);

        circulo = new JRadioButton("NETFLIX");
        circulo.setBounds(750, 88, 114, 14);
        contentPane.add(circulo);

        circulo1 = new JRadioButton("PRIME VIDEO");
        circulo1.setBounds(750, 108, 114, 14);
        contentPane.add(circulo1);

        circulo2 = new JRadioButton("DISNEY+");
        circulo2.setBounds(750, 128, 114, 14);
        contentPane.add(circulo2);

        circulo3 = new JRadioButton("TELECINE");
        circulo3.setBounds(750, 148, 114, 14);
        contentPane.add(circulo3);

        checkBoxAssistido = new JCheckBox("ASSISTIDO");
        checkBoxAssistido.setBounds(750,180, 250,20);
        contentPane.add(checkBoxAssistido);

        avaliacao = new JLabel("AVALIAÇÃO");
        avaliacao.setBounds(750,210, 200,20);
        contentPane.add(avaliacao);

        estrela = new JPanel();
        estrela.add(new StarRater(5));
        estrela.setBounds(740,230, 100,80);
        estrela.setForeground(Color.blue);
        contentPane.add(estrela);

        botaoSalvar.addActionListener(new EventoBotaoSalvar(textoTitulo.getText(), textoSinopse.getText(), generoComboBox.getSelectedItem().toString()));

        lbl_close = new JLabel("X");
        lbl_close.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                System.exit(0);
            }
        });
        lbl_close.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_close.setForeground(new Color(241, 57, 83));
        lbl_close.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lbl_close.setBounds(869, 5, 27, 27);
        contentPane.add(lbl_close);
    }
}