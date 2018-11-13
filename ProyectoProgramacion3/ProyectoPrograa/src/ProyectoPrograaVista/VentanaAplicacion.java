/*
 Clase VentanaAplicacion, Crea una ventana
Autor: Alejandro Gamboa Barahona
09/05/2017
 */
package ProyectoPrograaVista;

import ProyectoPrograaControl.ControlAplicacion;
import java.awt.Component;
import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alejandro
 */
public class VentanaAplicacion extends javax.swing.JFrame {
    
    DefaultTableModel model=new DefaultTableModel();

    /**
     * Creates new form VentanaAplicacion
     */
    public VentanaAplicacion(String titulo,ControlAplicacion nuevogestor) {
        super(titulo);
        this.gestor=nuevogestor;
        setVisible(true);
        contadorFila=0;
        contadorColumna=1;
        hayCambios=false;
        primero=true;
        op=0;
        initComponents();
        setup();
        iniciarEstado();
    }
    public void init(){
        setVisible(true);
        gestor.registrarObservador((Observer) this);
    }
    private void iniciarEstado(){
    model.addColumn("");
    model.addColumn("Partido 1");
    String []fila= new String[tablaDatos.getColumnCount()];
    fila[0]="";
    model.addRow(fila);
    model.setValueAt("Votos:", 0,0);
    this.tablaDatos.setModel(model);
   }
    private String[] getRemainingIdentifiers(int columnIndex){
    String[] identifiers= new String[tablaDatos.getColumnCount()-1];
    int k=0;
    for(int i=0;i<tablaDatos.getColumnCount();i++){
        if(i != columnIndex) {
            identifiers[k++] = tablaDatos.getColumnName(i);
        }
    }

    return identifiers;
}
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        partidos = new javax.swing.JLabel();
        btnSumarPartidos = new javax.swing.JButton();
        btnRestarPartidos = new javax.swing.JButton();
        curules = new javax.swing.JLabel();
        btnSumarEscano = new javax.swing.JButton();
        btnRestarEscano = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new ProyectoPrograaModelo.DTable(); //javax.swing.JTable();
        menuOpciones = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        itemSalir = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        partidos.setText("Partidos");

        btnSumarPartidos.setText("+");
        btnSumarPartidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarPartidosActionPerformed(evt);
            }
        });

        btnRestarPartidos.setText("-");
        btnRestarPartidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarPartidosActionPerformed(evt);
            }
        });

        curules.setText("Curules");

        btnSumarEscano.setText("+");
        btnSumarEscano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarEscanoActionPerformed(evt);
            }
        });

        btnRestarEscano.setText("-");
        btnRestarEscano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarEscanoActionPerformed(evt);
            }
        });

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaDatos);

        menuArchivo.setText("Archivo");

        itemSalir.setText("Salir");
        itemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(itemSalir);

        menuOpciones.add(menuArchivo);

        menuAyuda.setText("Ayuda");
        menuOpciones.add(menuAyuda);

        setJMenuBar(menuOpciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(partidos, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(curules)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnSumarEscano)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnRestarEscano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnSumarPartidos)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnRestarPartidos))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(partidos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSumarPartidos)
                            .addComponent(btnRestarPartidos))
                        .addGap(28, 28, 28)
                        .addComponent(curules)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSumarEscano)
                            .addComponent(btnRestarEscano))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSumarPartidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarPartidosActionPerformed
    contadorColumna++;
    if(contadorColumna <=6){
    model.addColumn(setearPartidos(contadorColumna));
    model.fireTableStructureChanged();
    gestor.generarContainer(contadorColumna);
    gestor.llenandoContainer(contadorColumna);
    gestor.mensajeMasPartido();
    
    }
    else{System.out.println("Maximo de partidos");
    }
// TODO add your handling code here:
    }//GEN-LAST:event_btnSumarPartidosActionPerformed

    private void btnSumarEscanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarEscanoActionPerformed
        agregarCurules();
        gestor.mensajeMasCurules();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSumarEscanoActionPerformed

    private void btnRestarPartidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarPartidosActionPerformed
   removerColum(contadorColumna);
   contadorColumna++;
   model.fireTableStructureChanged();
   gestor.generarContainer(contadorColumna);
   gestor.llenandoContainer(contadorColumna);
   gestor.mensajeMenosPartido();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRestarPartidosActionPerformed

    private void btnRestarEscanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarEscanoActionPerformed
      if(contadorFila>0){
      model.removeRow(contadorFila);
      contadorFila--;
      model.fireTableStructureChanged();
      gestor.mensajeMenosCurules();
     
      }else{
          {System.out.println("nada que eliminar");}
      }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRestarEscanoActionPerformed

    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
    System.exit(0); 
// TODO add your handling code here:
    }//GEN-LAST:event_itemSalirActionPerformed
private void setup(){
        setSize(680, 420);
        setMinimumSize(new Dimension(300, 300));
        setResizable(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);        
    }
    /**
     * @param args the command line arguments
     */

private void removerColum(int columIndex){
if((tablaDatos.getColumnCount()-1)>0){
String[][] data= new String[tablaDatos.getRowCount()][tablaDatos.getColumnCount()-1];
for (int i=0;i<tablaDatos.getRowCount();i++){
    for(int j=0;j<tablaDatos.getColumnCount();j++){
   if(j!=columIndex){
       if(tablaDatos.getValueAt(i,j)==null){
       tablaDatos.setValueAt("",i,j);
       }
       if(j<columIndex){
       data[i][j]=tablaDatos.getValueAt(i,j).toString();
       }
       else{
       data[i][j-1]=tablaDatos.getValueAt(i,j).toString();
       }
   
   }
    }
}
DefaultTableModel modeltable= new DefaultTableModel(data,getRemainingIdentifiers(columIndex));
model= modeltable;
tablaDatos.setModel(model);
}
else{System.out.println("error");}
}
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaAplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAplicacion("",new ControlAplicacion()).setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRestarEscano;
    private javax.swing.JButton btnRestarPartidos;
    private javax.swing.JButton btnSumarEscano;
    private javax.swing.JButton btnSumarPartidos;
    private javax.swing.JLabel curules;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenuBar menuOpciones;
    private javax.swing.JLabel partidos;
    private javax.swing.JTable tablaDatos;
    // End of variables declaration//GEN-END:variables
    private final ControlAplicacion gestor;
    private int contadorColumna;
    private boolean hayCambios;
    private int contadorFila;
    private boolean primero;
    private int op;
    
    private void menosPartidos(){
    removerColum(contadorColumna);
    contadorColumna--;
    model.fireTableStructureChanged();
    }
    private String setearRonda(int x){
    String palabra= new String();
    switch(x){
        case 1: 
            palabra= "Escaño 1";
            break;
        case 2:
            palabra= "Escaño 2";
            break;
        case 3:
            palabra= "Escaño 3";
            break;
        case 4:
            palabra= "Escaño 4";
            break;
        case 5:
            palabra= "Escaño 5";
            break;
            case 6:
            palabra= "Escaño 6";
            break;
        case 7:
            palabra= "Escaño 7";
            break;
            case 8:
            palabra= "Escaño 8";
            break;
        default:
            ;
            
            
    }
    return palabra;
    }
    private String setearPartidos(int y){
    String palabra= new String();
    switch(y){
        case 2:
            palabra= "Partido 2";
            break;
        case 3: 
            palabra= "Partido 3";
            break;
        case 4: 
            palabra= "Partido 4";
                    break;
        case 5:
            palabra= "Partido 5";
            break;
        case 6:
            palabra = "Partido 6";
            break;
        case 7:
            palabra = "Partido 7";
            break;
        case 8:
            palabra= "Partido 8";
            break;
        default:
            ;
    }
    return palabra;
    }
    public JTable obtenerDatos(){
    return tablaDatos;
    }
    public int getContadorC(){
    return contadorColumna;
    }
    public int getContadorF(){
    return contadorFila;
    }
    private void agregarCurules(){
    if(11!=contadorFila){
    String[] fila= new String[tablaDatos.getColumnCount()];
    if(contadorFila==0){
    for(int i=1;i<tablaDatos.getColumnCount();i++){
    if(i<tablaDatos.getColumnCount()){
    fila[i]= tablaDatos.getValueAt(0,i).toString();
    gestor.setearValor(i,fila);
    }
    }
    dHont(fila);
    contadorFila++;
    model.addRow(fila);
    model.setValueAt(setearRonda(contadorFila), contadorFila, 0);
    } else if(contadorFila!=0){
        dHont(fila);
        contadorFila++;
        model.addRow(fila);
        model.setValueAt(setearRonda(contadorFila),contadorFila,0);
    }
    } else {
    System.out.println("Maximo alcanzado");
    }
    }
    public String comparar(String[]a, boolean cambio){
    String g= new String();
    
    if(primero==true){
    for(int i=1;i<tablaDatos.getColumnCount();i++){
        if("".equals(g)){
        int val= Integer.parseInt(tablaDatos.getValueAt(0,i).toString());
        int val2= Integer.parseInt(tablaDatos.getValueAt(0,i+1).toString());
        if(val>val2){
        g= tablaDatos.getValueAt(0,i).toString();
        gestor.agregarValor(i, val);
        }
        else{
        g=tablaDatos.getValueAt(0,i+1).toString();
        gestor.agregarValor(i, val2);
        }
        } else {
        int val= Integer.parseInt(g);
        int val2= Integer.parseInt(tablaDatos.getValueAt(0,i).toString());
        if(val<val2){
        g= Integer.toString(val2);
        gestor.agregarValor(i, val2);
        } else{
        gestor.agregarValor(i, val2);
        g=Integer.toString(val);
        }
        }
    }
    primero=false;
    } else{
    int val3=0;
    int val4=0;
    
    for(int j=1;j<tablaDatos.getColumnCount();j++){
    if((j+1)<tablaDatos.getColumnCount()){
    if(this.hayCambios){
    val3= Integer.parseInt(a[j]);
    op=0;
    if(a[j+1]!=null){
    val4=Integer.parseInt(a[j+1]);
    }else{
    val4=Integer.parseInt(tablaDatos.getValueAt(contadorFila,j+1).toString());
    }
    this.hayCambios=false;
    }else{
    val3=buscaMayor(a);
    val4= Integer.parseInt(tablaDatos.getValueAt(contadorFila,j+1).toString());
    }
    if(val3<val4){
    g=Integer.toString(val4);
    } else{
    g= Integer.toString(val3);
    }
    }
    }
    } return g;
    }
    
    public void dHont(String[] a){
    int col= tablaDatos.getColumnCount();
    for(int i=1;i<col;i++){
    int dato=gestor.obtenerContainer().elementAt(i-1).getValor();
    int denominador= gestor.obtenerContainer().elementAt(i-1).getCurulesGanadas()+1;
    int resultado=(dato/denominador);
    a[i]= Integer.toString(resultado);
    if(contadorFila>=1){
    hayCambios=true;
    }
    int s= Integer.parseInt(comparar(a,hayCambios));
    if (resultado ==s){
    if(denominador>=1){
    gestor.obtenerContainer().elementAt(i-1).aumentoGane();
    }
    }
    }
    }
    private int buscaMayor(String[]a){
    int resultado=0;
    int valor=0;
    for(int i=1;i<contadorColumna;i++){
    if(a[i+1]!=null){
    if(op==0){
    op=Integer.parseInt(a[i]);
    } else{
    valor= Integer.parseInt(a[i+1]);
    }if(op>valor){
    resultado=op;
    } else{
    op=valor;
    resultado=valor;
    }
    }else{
            if(op==0){
            op=Integer.parseInt(a[1]);
            resultado=op;
            break;
            }
            }
    }
    return resultado;
    }
   public void update(Observable o, Object o1){
   this.tablaDatos.setModel(model);
   this.tablaDatos.setCellSelectionEnabled(true);
   this.tablaDatos.getTableHeader().setReorderingAllowed(false);
   }
}
