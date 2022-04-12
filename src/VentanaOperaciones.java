import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaOperaciones extends JFrame {
    private JPanel panel;
    private ListaDoble lista1;
    private ListaDoble lista2;
    public VentanaOperaciones(){
        setSize(700, 500);//Establecemos el tamaño de la ventana
        setTitle("OPERACIONES CON POLINOMIOS");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);//Codigo base de la ventana sin panel
        iniciarComponentes();
    }

    //Método para iniciar los componentes del Frame
    public void iniciarComponentes(){
        panel = new JPanel();
        panel.setBounds(0, 0, 700, 500);
        panel.setBackground( new Color(177, 186, 197));
        panel.setLayout(null);
        this.getContentPane().add(panel);

        /////////////Entrada de valor Escalar
        JLabel escalar = new JLabel("Escalar:");
        escalar.setFont(new Font("Cousine", 1, 20));
        escalar.setForeground(Color.black);
        escalar.setBounds(470,20,100, 30);
        panel.add(escalar);
        JTextField inputEscalar = new JTextField();
        inputEscalar.setBounds(580, 20, 40, 30);
        formatoTextField(inputEscalar);


        //////////////////////////////////////////////
        /////////////POLINOMIO 1
        ///////////////////////////////////////////////

        JLabel p1 = new JLabel("POLINOMIO 1   Grado:");
        p1.setFont(new Font("Cousine", 1, 20));
        p1.setForeground(Color.black);
        p1.setBounds(30,20,250, 30);
        panel.add(p1);

        JComboBox grado1 = new JComboBox();
        grado1.setBounds(280, 20, 50, 30);
        DefaultComboBoxModel grado1Model = new DefaultComboBoxModel();
        grado1.setModel(grado1Model);
        grado1Model.addElement("");
        grado1Model.addElement("0");
        grado1Model.addElement("1");
        grado1Model.addElement("2");
        grado1Model.addElement("3");
        grado1Model.addElement("4");
        grado1Model.addElement("5");
        grado1Model.addElement("6");
        panel.add(grado1);

        JLabel x61 = new JLabel("x");//x es la variable, 6 es el grado, 1 es el polinomio al que pertenece
        x61.setBounds(30,70,12, 30);
        JLabel e61 = new JLabel("6");//exponente
        e61.setBounds(42,65,12, 20);
        formatoVariables(x61, e61);
        JTextField c61 = new JTextField();//coeficiente
        c61.setBounds(60, 70, 35, 30 );
        formatoTextField(c61);

        JLabel x51 = new JLabel("x");//x es la variable, 6 es el grado, 1 es el polinomio al que pertenece
        x51.setBounds(125,70,12, 30);
        JLabel e51 = new JLabel("5");//exponente
        e51.setBounds(137,65,12, 20);
        formatoVariables(x51, e51);
        JTextField c51 = new JTextField();//coeficiente
        c51.setBounds(155, 70, 35, 30 );
        formatoTextField(c51);

        JLabel x41 = new JLabel("x");//x es la variable, 6 es el grado, 1 es el polinomio al que pertenece
        x41.setBounds(220,70,12, 30);
        JLabel e41 = new JLabel("4");//exponente
        e41.setBounds(232,65,12, 20);
        formatoVariables(x41, e41);
        JTextField c41 = new JTextField();//coeficiente
        c41.setBounds(250, 70, 35, 30 );
        formatoTextField(c41);

        JLabel x31 = new JLabel("x");//x es la variable, 6 es el grado, 1 es el polinomio al que pertenece
        x31.setBounds(315,70,12, 30);
        JLabel e31 = new JLabel("3");//exponente
        e31.setBounds(327,65,12, 20);
        formatoVariables(x31, e31);
        JTextField c31 = new JTextField();//coeficiente
        c31.setBounds(345, 70, 35, 30 );
        formatoTextField(c31);

        JLabel x21 = new JLabel("x");//x es la variable, 6 es el grado, 1 es el polinomio al que pertenece
        x21.setBounds(410,70,12, 30);
        JLabel e21 = new JLabel("2");//exponente
        e21.setBounds(422,65,12, 20);
        formatoVariables(x21, e21);
        JTextField c21 = new JTextField();//coeficiente
        c21.setBounds(440, 70, 35, 30 );
        formatoTextField(c21);

        JLabel x11 = new JLabel("x");//x es la variable, 6 es el grado, 1 es el polinomio al que pertenece
        x11.setBounds(505,70,12, 30);
        JLabel e11 = new JLabel("");//exponente
        e11.setBounds(517,65,12, 20);
        formatoVariables(x11, e11);
        JTextField c11 = new JTextField();//coeficiente
        c11.setBounds(530, 70, 35, 30 );
        formatoTextField(c11);

        JLabel x01 = new JLabel("T.I.");//x es la variable, 6 es el grado, 1 es el polinomio al que pertenece
        x01.setBounds(595,70,40, 30);
        JLabel e01 = new JLabel("");//exponente
        //e11.setBounds(517,65,12, 20);
        formatoVariables(x01, x01);
        JTextField c01 = new JTextField();//coeficiente
        c01.setBounds(635, 70, 35, 30 );
        formatoTextField(c01);




        //////////////////////////////////////////////
        /////////////POLINOMIO 2
        ///////////////////////////////////////////////

        JLabel p2 = new JLabel("POLINOMIO 2   Grado:");
        p2.setFont(new Font("Cousine", 1, 20));
        p2.setForeground(Color.black);
        p2.setBounds(30,150,250, 30);
        panel.add(p2);

        JComboBox grado2 = new JComboBox();
        grado2.setBounds(280, 150, 50, 30);
        DefaultComboBoxModel grado2Model = new DefaultComboBoxModel();
        grado2.setModel(grado2Model);
        grado2Model.addElement("");
        grado2Model.addElement("0");
        grado2Model.addElement("1");
        grado2Model.addElement("2");
        grado2Model.addElement("3");
        grado2Model.addElement("4");
        grado2Model.addElement("5");
        grado2Model.addElement("6");
        panel.add(grado2);

        JLabel x62 = new JLabel("x");//x es la variable, 6 es el grado, 1 es el polinomio al que pertenece
        x62.setBounds(30,200,12, 30);
        JLabel e62 = new JLabel("6");//exponente
        e62.setBounds(42,195,12, 20);
        formatoVariables(x62, e62);
        JTextField c62 = new JTextField();//coeficiente
        c62.setBounds(60, 200, 35, 30 );
        formatoTextField(c62);

        JLabel x52 = new JLabel("x");//x es la variable, 6 es el grado, 1 es el polinomio al que pertenece
        x52.setBounds(125,200,12, 30);
        JLabel e52 = new JLabel("5");//exponente
        e52.setBounds(137,195,12, 20);
        formatoVariables(x52, e52);
        JTextField c52 = new JTextField();//coeficiente
        c52.setBounds(155, 200, 35, 30 );
        formatoTextField(c52);

        JLabel x42 = new JLabel("x");//x es la variable, 6 es el grado, 1 es el polinomio al que pertenece
        x42.setBounds(220,200,12, 30);
        JLabel e42 = new JLabel("4");//exponente
        e42.setBounds(232,195,12, 20);
        formatoVariables(x42, e42);
        JTextField c42 = new JTextField();//coeficiente
        c42.setBounds(250, 200, 35, 30 );
        formatoTextField(c42);

        JLabel x32 = new JLabel("x");//x es la variable, 6 es el grado, 1 es el polinomio al que pertenece
        x32.setBounds(315,200,12, 30);
        JLabel e32 = new JLabel("3");//exponente
        e32.setBounds(327,195,12, 20);
        formatoVariables(x32, e32);
        JTextField c32 = new JTextField();//coeficiente
        c32.setBounds(345, 200, 35, 30 );
        formatoTextField(c32);

        JLabel x22 = new JLabel("x");//x es la variable, 6 es el grado, 1 es el polinomio al que pertenece
        x22.setBounds(410,200,12, 30);
        JLabel e22 = new JLabel("2");//exponente
        e22.setBounds(422,195,12, 20);
        formatoVariables(x22, e22);
        JTextField c22 = new JTextField();//coeficiente
        c22.setBounds(440, 200, 35, 30 );
        formatoTextField(c22);

        JLabel x12 = new JLabel("x");//x es la variable, 6 es el grado, 1 es el polinomio al que pertenece
        x12.setBounds(505,200,12, 30);
        JLabel e12 = new JLabel("");//exponente
        e12.setBounds(517,195,12, 20);
        formatoVariables(x12, e12);
        JTextField c12 = new JTextField();//coeficiente
        c12.setBounds(530, 200, 35, 30 );
        formatoTextField(c12);

        JLabel x02 = new JLabel("T.I.");//x es la variable, 6 es el grado, 1 es el polinomio al que pertenece
        x02.setBounds(595,200,40, 30);
        JLabel e02 = new JLabel("");//exponente
        //e12.setBounds(517,65,12, 20);
        formatoVariables(x02, x02);
        JTextField c02 = new JTextField();//coeficiente
        c02.setBounds(635, 200, 35, 30 );
        formatoTextField(c02);

        //////////////////////////////////////////
        ///////////////BOTONES
        ///////////////////////////////////////7

        JButton suma = new JButton("SUMAR");
        suma.setBackground(new Color(120, 169, 223));
        suma.setBounds(100, 285, 200, 40);
        suma.setForeground(Color.black);
        suma.setFont(new Font("Cousine", 1, 15));
        panel.add(suma);

        JButton resta = new JButton("RESTAR");
        resta.setBackground(new Color(120, 169, 223));
        resta.setBounds(400, 285, 200, 40);
        resta.setForeground(Color.black);
        resta.setFont(new Font("Cousine", 1, 15));
        panel.add(resta);

        JButton mult = new JButton("MULTIPLICAR");
        mult.setBackground(new Color(120, 169, 223));
        mult.setBounds(100, 350, 200, 40);
        mult.setForeground(Color.black);
        mult.setFont(new Font("Cousine", 1, 15));
        panel.add(mult);

        JButton multEsc = new JButton("MULT. POR ESCALAR");
        multEsc.setBackground(new Color(120, 169, 223));
        multEsc.setBounds(400, 350, 200, 40);
        multEsc.setForeground(Color.black);
        multEsc.setFont(new Font("Cousine", 1, 15));
        panel.add(multEsc);



        /////////////////////////////////////////////
        //////////////////Listeners
        ////////////////////////////////////////

        //////Deshabilita los campos de los exponentes que no forman parte del grado
        grado1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                    c61.setText("");
                    c51.setText("");
                    c41.setText("");
                    c31.setText("");
                    c21.setText("");
                    c11.setText("");
                    if(grado1.getSelectedItem().toString().equals("0")){
                        c61.setEditable(false);
                        c51.setEditable(false);
                        c41.setEditable(false);
                        c31.setEditable(false);
                        c21.setEditable(false);
                        c11.setEditable(false);
                        c01.setEditable(true);
                    }
                    else if(grado1.getSelectedItem().toString().equals("1")){
                        c61.setEditable(false);
                        c51.setEditable(false);
                        c41.setEditable(false);
                        c31.setEditable(false);
                        c21.setEditable(false);
                        c11.setEditable(true);
                        c01.setEditable(true);
                    }
                    else if(grado1.getSelectedItem().toString().equals("2")){
                        c61.setEditable(false);
                        c51.setEditable(false);
                        c41.setEditable(false);
                        c31.setEditable(false);
                        c21.setEditable(true);
                        c11.setEditable(true);
                        c01.setEditable(true);
                    }
                    else if(grado1.getSelectedItem().toString().equals("3")){
                        c61.setEditable(false);
                        c51.setEditable(false);
                        c41.setEditable(false);
                        c31.setEditable(true);
                        c21.setEditable(true);
                        c11.setEditable(true);
                        c01.setEditable(true);
                    }
                    else if(grado1.getSelectedItem().toString().equals("4")){
                        c61.setEditable(false);
                        c51.setEditable(false);
                        c41.setEditable(true);
                        c31.setEditable(true);
                        c21.setEditable(true);
                        c11.setEditable(true);
                        c01.setEditable(true);
                    }
                    else if(grado1.getSelectedItem().toString().equals("5")){
                        c61.setEditable(false);
                        c51.setEditable(true);
                        c41.setEditable(true);
                        c31.setEditable(true);
                        c21.setEditable(true);
                        c11.setEditable(true);
                        c01.setEditable(true);
                    }
                    else if(grado1.getSelectedItem().toString().equals("6")){
                        c61.setEditable(true);
                        c51.setEditable(true);
                        c41.setEditable(true);
                        c31.setEditable(true);
                        c21.setEditable(true);
                        c11.setEditable(true);
                        c01.setEditable(true);
                    }

                }
            }
        });
        grado2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                    c62.setText("");
                    c52.setText("");
                    c42.setText("");
                    c32.setText("");
                    c22.setText("");
                    c12.setText("");

                    if(grado2.getSelectedItem().toString().equals("0")){
                        c62.setEditable(false);
                        c52.setEditable(false);
                        c42.setEditable(false);
                        c32.setEditable(false);
                        c22.setEditable(false);
                        c12.setEditable(false);
                        c02.setEditable(true);

                    }
                    else if(grado2.getSelectedItem().toString().equals("1")){
                        c62.setEditable(false);
                        c52.setEditable(false);
                        c42.setEditable(false);
                        c32.setEditable(false);
                        c22.setEditable(false);
                        c12.setEditable(true);
                        c02.setEditable(true);
                    }
                    else if(grado2.getSelectedItem().toString().equals("2")){
                        c62.setEditable(false);
                        c52.setEditable(false);
                        c42.setEditable(false);
                        c32.setEditable(false);
                        c22.setEditable(true);
                        c12.setEditable(true);
                        c02.setEditable(true);
                    }
                    else if(grado2.getSelectedItem().toString().equals("3")){
                        c62.setEditable(false);
                        c52.setEditable(false);
                        c42.setEditable(false);
                        c32.setEditable(true);
                        c22.setEditable(true);
                        c12.setEditable(true);
                        c02.setEditable(true);
                    }
                    else if(grado2.getSelectedItem().toString().equals("4")){
                        c62.setEditable(false);
                        c52.setEditable(false);
                        c42.setEditable(true);
                        c32.setEditable(true);
                        c22.setEditable(true);
                        c12.setEditable(true);
                        c02.setEditable(true);
                    }
                    else if(grado2.getSelectedItem().toString().equals("5")){
                        c62.setEditable(false);
                        c52.setEditable(true);
                        c42.setEditable(true);
                        c32.setEditable(true);
                        c22.setEditable(true);
                        c12.setEditable(true);
                        c02.setEditable(true);
                    }
                    else if(grado2.getSelectedItem().toString().equals("6")){
                        c62.setEditable(true);
                        c52.setEditable(true);
                        c42.setEditable(true);
                        c32.setEditable(true);
                        c22.setEditable(true);
                        c12.setEditable(true);
                        c02.setEditable(true);
                    }

                }
            }
        });

        ///////Si el escalar tiene un numero, deshabilita el polinomio 2
        inputEscalar.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e){
                c62.setText("");
                c62.setEditable(false);
                c52.setText("");
                c52.setEditable(false);
                c42.setText("");
                c42.setEditable(false);
                c32.setText("");
                c32.setEditable(false);
                c22.setText("");
                c22.setEditable(false);
                c12.setText("");
                c12.setEditable(false);
                c02.setText("");
                c02.setEditable(false);

            }
        });

        //////////////////////////////////////
        ////////// LISTENERS DE BOTONES
        //////////////////////////////////

        //botón suma
        ActionListener genSuma = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int gradoS1 = Integer.parseInt(grado1.getSelectedItem().toString());
                int gradoS2 = Integer.parseInt(grado2.getSelectedItem().toString());
                crearLista1(gradoS1, c01,c11, c21, c31, c41, c51, c61);
                crearLista2(gradoS2, c02,c12, c22, c32, c42, c52, c62);
                ListaDoble.sumar(lista1, lista2);

            }
        };
        suma.addActionListener(genSuma);

        //botón resta
        ActionListener genResta = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int gradoS1 = Integer.parseInt(grado1.getSelectedItem().toString());
                int gradoS2 = Integer.parseInt(grado2.getSelectedItem().toString());
                crearLista1(gradoS1, c01,c11, c21, c31, c41, c51, c61);
                crearLista2(gradoS2, c02,c12, c22, c32, c42, c52, c62);
                ListaDoble.restar(lista1, lista2);
            }
        };
        resta.addActionListener(genResta);

        //botón multiplicación
        ActionListener genMult = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int gradoS1 = Integer.parseInt(grado1.getSelectedItem().toString());
                int gradoS2 = Integer.parseInt(grado2.getSelectedItem().toString());
                crearLista1(gradoS1, c01,c11, c21, c31, c41, c51, c61);
                crearLista2(gradoS2, c02,c12, c22, c32, c42, c52, c62);
                ListaDoble nuevaLista = new ListaDoble();
                nuevaLista.multiplicar(lista1, lista2);
            }
        };
        mult.addActionListener(genMult);

        //botón multiplicacion por escalar
        ActionListener genMultEsc = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int gradoS1 = Integer.parseInt(grado1.getSelectedItem().toString());
                crearLista1(gradoS1, c01,c11, c21, c31, c41, c51, c61);
                int esc = Integer.parseInt(inputEscalar.getText());
                ListaDoble nuevaLista = new ListaDoble();
                nuevaLista.multiplicarEscalar(lista1, esc);

            }
        };
        multEsc.addActionListener(genMultEsc);


    }

    public void formatoTextField(JTextField o){
        o.setFont(new Font("Cousine", 1, 16));
        o.setForeground(Color.black);
        o.setHorizontalAlignment(SwingConstants.CENTER);
        o.setBackground(new Color(177, 186, 230));
        panel.add(o);
    }
    public void formatoVariables(JLabel x, JLabel e){
        x.setFont(new Font("Cousine", 2, 20));
        e.setFont(new Font("Cousine", 0, 16));
        x.setForeground(Color.black);
        e.setForeground(Color.black);
        panel.add(x);
        panel.add(e);
    }

    public void crearLista1(int grado, JTextField f0, JTextField f1, JTextField f2, JTextField f3, JTextField f4,
                            JTextField f5, JTextField f6){
        lista1 = new ListaDoble();
        switch (grado){
            case 6:
                lista1.insertarTermino(Integer.parseInt(f6.getText()), 6);
                lista1.insertarTermino(Integer.parseInt(f5.getText()), 5);
                lista1.insertarTermino(Integer.parseInt(f4.getText()), 4);
                lista1.insertarTermino(Integer.parseInt(f3.getText()), 3);
                lista1.insertarTermino(Integer.parseInt(f2.getText()), 2);
                lista1.insertarTermino(Integer.parseInt(f1.getText()), 1);
                lista1.insertarTermino(Integer.parseInt(f0.getText()), 0);
                break;
            case 5:
                lista1.insertarTermino(Integer.parseInt(f5.getText()), 5);
                lista1.insertarTermino(Integer.parseInt(f4.getText()), 4);
                lista1.insertarTermino(Integer.parseInt(f3.getText()), 3);
                lista1.insertarTermino(Integer.parseInt(f2.getText()), 2);
                lista1.insertarTermino(Integer.parseInt(f1.getText()), 1);
                lista1.insertarTermino(Integer.parseInt(f0.getText()), 0);
                break;
            case 4:
                lista1.insertarTermino(Integer.parseInt(f4.getText()), 4);
                lista1.insertarTermino(Integer.parseInt(f3.getText()), 3);
                lista1.insertarTermino(Integer.parseInt(f2.getText()), 2);
                lista1.insertarTermino(Integer.parseInt(f1.getText()), 1);
                lista1.insertarTermino(Integer.parseInt(f0.getText()), 0);
                break;
            case 3:
                lista1.insertarTermino(Integer.parseInt(f3.getText()), 3);
                lista1.insertarTermino(Integer.parseInt(f2.getText()), 2);
                lista1.insertarTermino(Integer.parseInt(f1.getText()), 1);
                lista1.insertarTermino(Integer.parseInt(f0.getText()), 0);
                break;
            case 2:
                lista1.insertarTermino(Integer.parseInt(f2.getText()), 2);
                lista1.insertarTermino(Integer.parseInt(f1.getText()), 1);
                lista1.insertarTermino(Integer.parseInt(f0.getText()), 0);
                break;
            case 1:
                lista1.insertarTermino(Integer.parseInt(f1.getText()), 1);
                lista1.insertarTermino(Integer.parseInt(f0.getText()), 0);
                break;
            case 0:
                lista1.insertarTermino(Integer.parseInt(f0.getText()), 0);
                break;
        }
    }
    public void crearLista2(int grado, JTextField f0, JTextField f1, JTextField f2, JTextField f3, JTextField f4,
                            JTextField f5, JTextField f6){
        lista2 = new ListaDoble();
        switch (grado){
            case 6:
                lista2.insertarTermino(Integer.parseInt(f6.getText()), 6);
                lista2.insertarTermino(Integer.parseInt(f5.getText()), 5);
                lista2.insertarTermino(Integer.parseInt(f4.getText()), 4);
                lista2.insertarTermino(Integer.parseInt(f3.getText()), 3);
                lista2.insertarTermino(Integer.parseInt(f2.getText()), 2);
                lista2.insertarTermino(Integer.parseInt(f1.getText()), 1);
                lista2.insertarTermino(Integer.parseInt(f0.getText()), 0);
                break;
            case 5:
                lista2.insertarTermino(Integer.parseInt(f5.getText()), 5);
                lista2.insertarTermino(Integer.parseInt(f4.getText()), 4);
                lista2.insertarTermino(Integer.parseInt(f3.getText()), 3);
                lista2.insertarTermino(Integer.parseInt(f2.getText()), 2);
                lista2.insertarTermino(Integer.parseInt(f1.getText()), 1);
                lista2.insertarTermino(Integer.parseInt(f0.getText()), 0);
                break;
            case 4:
                lista2.insertarTermino(Integer.parseInt(f4.getText()), 4);
                lista2.insertarTermino(Integer.parseInt(f3.getText()), 3);
                lista2.insertarTermino(Integer.parseInt(f2.getText()), 2);
                lista2.insertarTermino(Integer.parseInt(f1.getText()), 1);
                lista2.insertarTermino(Integer.parseInt(f0.getText()), 0);
                break;
            case 3:
                lista2.insertarTermino(Integer.parseInt(f3.getText()), 3);
                lista2.insertarTermino(Integer.parseInt(f2.getText()), 2);
                lista2.insertarTermino(Integer.parseInt(f1.getText()), 1);
                lista2.insertarTermino(Integer.parseInt(f0.getText()), 0);
                break;
            case 2:
                lista2.insertarTermino(Integer.parseInt(f2.getText()), 2);
                lista2.insertarTermino(Integer.parseInt(f1.getText()), 1);
                lista2.insertarTermino(Integer.parseInt(f0.getText()), 0);
                break;
            case 1:
                lista2.insertarTermino(Integer.parseInt(f1.getText()), 1);
                lista2.insertarTermino(Integer.parseInt(f0.getText()), 0);
                break;
            case 0:
                lista2.insertarTermino(Integer.parseInt(f0.getText()), 0);
                break;
        }

    }

    public static void main(String[] args) {
        VentanaOperaciones nuevaVentana = new VentanaOperaciones();
        nuevaVentana.setVisible(true);

    }
}
