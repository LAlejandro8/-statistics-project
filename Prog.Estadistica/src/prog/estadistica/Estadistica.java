
package prog.estadistica;
import java.util.Arrays;

public class Estadistica extends javax.swing.JFrame {
    private double[] valores;
    private String[] cad;
 public Estadistica() {
        initComponents();
        this.setLocationRelativeTo(this);
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setTitle("ESTADISTICA");
        setBackground(new java.awt.Color(204, 255, 255));
        setFont(new java.awt.Font("Agency FB", 1, 10)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Ingrese números separados por comas.");

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("RESULTADO");

        jTextPane2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jScrollPane2.setViewportView(jTextPane2);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("EJEMPLO");

        jTextPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jScrollPane1.setViewportView(jTextPane1);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenu1.setText("Calcular");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem1.setText("Media");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem2.setText("Mediana");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem3.setText("Moda");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem8.setText("Media Armónica");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuItem9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem9.setText("Media Cuadrática");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem4.setText("Varianza");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem5.setText("Desviación");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jMenuItem7.setForeground(new java.awt.Color(255, 0, 0));
        jMenuItem7.setText("Borrar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem6.setForeground(new java.awt.Color(0, 0, 153));
        jMenuItem6.setText("Acerca de");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    String[] cad =this.jTextField1.getText().split(",");
	        double[] valores = new double[cad.length];
			for(int i=0; i<valores.length; i++){
            	valores[i] = Double.valueOf(cad[i]);
        	}
        double media = getMedia(valores); 
    jTextPane1.setText("Media: "+media+"\n\n");
    jTextPane2.setText("MEDIA:\nTambién es conocida como promedio. \nSe halla sumando todos los números que tenemos y luego dividimos entre el número total de ellos.\n\nEjemplo: Tenemos los números 1,2,3. \nLos sumamos y obtenemos 6. \nLuego divimos entre 3 porque tenemos tres números, el resultado es 2.");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
    String[] cad =this.jTextField1.getText().split(",");
	        double[] valores = new double[cad.length];
			for(int i=0; i<valores.length; i++){
            	valores[i] = Double.valueOf(cad[i]);
        	}
        double mediana = getMediana(valores);
    jTextPane1.setText("Mediana: "+mediana+"\n\n");
    jTextPane2.setText("MEDIANA:\nEs el valor que deja el mismo número de datos antes y despues de el, cuando los datos estan ordenados de menor a mayor.\n\n*Si el número de términos es impar, la mediana es el valor que ocupa el lugar central.\n\nEjemplo: Tenemos 1,2,3,4,5. \nLa Mediana es 3 xq está en el centro.\n\n*Si el número de términos es par, la mediana es el valor medio de los datos centrales.\n\nEjemplo: Tenemos 1,2,3,4,5,6. \nTomamos los números del centro 3 y 4, y les hallamos la media=3.5.");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
 String[] cad =this.jTextField1.getText().split(",");
	        double[] valores = new double[cad.length];
			for(int i=0; i<valores.length; i++){
            	valores[i] = Double.valueOf(cad[i]);
        	}
        String moda = getModa(cad);
        jTextPane1.setText(" Moda: \n Número.\t Veces. \n"+moda+"\n\n");
        jTextPane2.setText("MODA:\nEs el valor que se repite más veces. \nUna distribución puede tener más de una moda o no tener ninguna.\n\nEjemplo: Tenemos 4,6,6,7,9,11,13.\n La Moda es 6.");
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
   String[] cad =this.jTextField1.getText().split(",");
	        double[] valores = new double[cad.length];
			for(int i=0; i<valores.length; i++){
            	valores[i] = Double.valueOf(cad[i]);
        	}
        double varianza = getVarianza(valores);
   jTextPane1.setText("Varianza: "+varianza+"\n\n");
   jTextPane2.setText("VARIANZA:\nEs una medida que pretende establecer la cercanía de cada uno de los datos con respecto a la media.\n\nEjemplo: Tenemos 1,2,3, la media es 2. \nA cada número restamos la media y luego elevamos al cuadrado.\n (1-2) al cuadrado = 1\n (2-2) al cuadrado = 0\n (3-2) al cuadrado = 1.\nSe suman los resultados = 2 y dividimos entre el número de términos -1. \nEs decir 2/2=1.");
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
   String[] cad =this.jTextField1.getText().split(",");
	        double[] valores = new double[cad.length];
			for(int i=0; i<valores.length; i++){
            	valores[i] = Double.valueOf(cad[i]);
        	}
        double desviacion = getDesviacion(valores);
   jTextPane1.setText("Desviación: "+desviacion);
   jTextPane2.setText("");
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
jTextPane1.setText("Realizado por Michael Salazar y Frank Paz. @Copyright");        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
     jTextField1.setText("");
     jTextPane1.setText(""); 
     jTextPane2.setText("");
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
    String[] cad =this.jTextField1.getText().split(",");
	        double[] valores = new double[cad.length];
			for(int i=0; i<valores.length; i++){
            	valores[i] = Double.valueOf(cad[i]);
        	}
        double media = getMediaArmonica(valores); 
    jTextPane1.setText("Media Armónica: "+media+"\n\n");
    jTextPane2.setText("MEDIA Armónica:\nTambién es conocida como promedio. \nSe halla sumando todos los números que tenemos y luego dividimos entre el número total de ellos.\n\nEjemplo: Tenemos los números 1,2,3. \nLos sumamos y obtenemos 6. \nLuego divimos entre 3 porque tenemos tres números, el resultado es 2.");        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
                                                
    String[] cad =this.jTextField1.getText().split(",");
	        double[] valores = new double[cad.length];
			for(int i=0; i<valores.length; i++){
            	valores[i] = Double.valueOf(cad[i]);
        	}
        double media = getMediaCuadratica(valores); 
    jTextPane1.setText("Media Cuadrática: "+media+"\n\n");
    jTextPane2.setText("MEDIA Cuadrática:\nTambién es conocida como promedio. \nSe halla sumando todos los números que tenemos y luego dividimos entre el número total de ellos.\n\nEjemplo: Tenemos los números 1,2,3. \nLos sumamos y obtenemos 6. \nLuego divimos entre 3 porque tenemos tres números, el resultado es 2.");  // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    
    
    public static double getMedia(double ... datos) {
        double media = 0.0;
        for (double dato : datos) {
            media += dato;
        }
        return (media / datos.length);
    }
      public static double getMediaArmonica(double ... datos) {
        double media = 0.0;
         double suma=0.0;
        for (double dato : datos) {
            media = 1/(dato);
           suma+= media;
            
        }
        return (datos.length / suma);
    }
   public static double getMediaCuadratica(double ... datos) {
        double media = 0.0;
        double suma=0.0;
        double total=0.0;
        double resultado=0.0;
        for (double dato : datos) {
            media = Math.pow(dato, 2);
            suma +=media;
            total= Math.pow(suma, 0.5);
            resultado= total/(Math.pow(datos.length, 0.5));
        }
        return (resultado);
    }

 public static double getVarianza(double...datos){

        	double media = 0.0;
        for (double dato : datos){
        	media += dato;
        }

            double m=media / datos.length;
            double suma = 0;
            double v=0;
            double va=0;
            for (int i=0; i<datos.length; i++) {
                double Xi = datos[i];
                suma += Math.pow((Xi-m),2);
 }
            v+=datos.length-1;
       			va+=suma/v;
return va;
 } 
    public static double getDesviacion(double...datos){
    		double media = 0.0;
        for (double dato : datos){
        	media += dato;
        }

            double m=media / datos.length;
            double suma = 0;
            double v=0;
            double va=0;
            for (int i=0; i<datos.length; i++) {
                double Xi = datos[i];
                suma += Math.pow((Xi-m),2);

            }
            v+=datos.length-1;
       			va+=suma/v;

        return Math.sqrt(va);
    } 
    public static double getMediana(double ... datos) {
        double mediana=0.0;
        int x=0;
     
        Arrays.sort(datos);
        x = datos.length;
   
        if(x % 2==0){
            double x1=datos[((x-2)/2)];
            double x2=datos[x/2];
            mediana=(x1 + x2) / 2;
        }else{
            mediana=datos[(x - 1)/2];
        }
        return mediana;
    }
    public static String getModa(String ... datos){

        String moda = "";     	
       Arrays.sort(datos);		

        String[] grupos = new String[datos.length];		

        int ngrupos=1;	
        int igrupo=0; 	
        String grupo=datos[0];
        grupos[0]= datos[0];

        for(int i = 1; i<datos.length; i++){ 	
            if(grupo.equals(datos[i])){
               continue;
            }else{
               ngrupos++;
               igrupo++;
               grupo=datos[i];
               grupos[igrupo]=grupo;
            }
        }


        int[]frecuencia = new int[ngrupos];		

        for(int i = 0; i<ngrupos; i++){
            for(String evaluado : datos){
                if(evaluado != null && grupos[i].equals(evaluado)){
                    frecuencia[i]++;
                }
            }
       }
   for(int i=0; i<ngrupos; i++){


        		 moda += "  " + grupos[i] + " \t " + frecuencia[i] + "  \n";
       }
        return moda;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    // End of variables declaration//GEN-END:variables
}
