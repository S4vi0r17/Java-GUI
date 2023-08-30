# JFrame
Es una ventana o marco que puede contener otros componentes. JFrame forma la ventana base de la aplicación GUI.

Ejemplo de JFrame:

```java
import javax.swing.JFrame;

public class MiVentana extends JFrame {

  public MiVentana(){
    setSize(300, 200);
    setTitle("Mi Ventana");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true); 
  }

  public static void main(String[] args) {
    MiVentana ventana = new MiVentana(); 
  }

}
```

## setDefaultCloseOperation(int)
Define el comportamiento cuando el usuario cierra la ventana JFrame. Recibe una constante entera:

- (0)JFrame.DO_NOTHING_ON_CLOSE: No realiza ninguna acción al cerrar.
- (1)JFrame.HIDE_ON_CLOSE: Oculta la ventana cuando se cierra.
- (2)JFrame.DISPOSE_ON_CLOSE: Sólo cierra la ventana JFrame actual.
- (3)JFrame.EXIT_ON_CLOSE (Valor por defecto): Cierra la aplicación entera cuando se cierra la ventana.

Ejemplo:

```java
// Cerrar sólo esta ventana al cerrar 
frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
```

## setSize(int, int)
Establece el ancho y alto de la ventana JFrame en pixeles. 

- Parámetro int ancho: Ancho en pixeles
- Parámetro int alto: Alto en pixeles

Ejemplo:

```java
// Tamaño de 800x600
frame.setSize(800, 600); 
```

## setLocation(int, int) 
Define la posición inicial de la ventana en la pantalla.

- Parámetro int x: Posición horizontal desde la esquina superior izquierda 
- Parámetro int y: Posición vertical desde la esquina superior izquierda

Ejemplo:

```java 
// Posición (100, 50) 
frame.setLocation(100, 50);
```

## setLayout(LayoutManager)
Define el LayoutManager que organiza los componentes dentro del contenedor JFrame.

Ejemplo: 

```java
frame.setLayout(new BorderLayout()); // Layout de Bordes
```

## add(Component)
Agrega un componente GUI a la ventana como JButton, JTextArea, etc.

Ejemplo:

```java
frame.add(new JButton("Botón"));
```

## setLocationRelativeTo(Component)
Posiciona la ventana en relación a otro componente o ventana.

- Si se pasa null, centra la ventana en la pantalla.
```java
JFrame frame = new JFrame();
frame.setLocationRelativeTo(null);
```

- Si se pasa un Component, centra la ventana sobre ese componente.
```java
JButton button = new JButton();
JFrame frame = new JFrame();

frame.setLocationRelativeTo(button);  // Centrará la ventana frame sobre el componente button.
```


## setBounds(int, int, int, int)
Permite setear la posición y dimensiones de un solo llamado.

  - x, y: posición del componente
  - width: ancho del componente 
  - height: alto del componente

> Es equivalente a llamar setLocation(), setSize() y setPreferredSize() de forma individual.

**Ejemplo de uso:**

```java
JFrame frame = new JFrame();

frame.setBounds(100, 100, 400, 300); // x:100, y:100 y un tamaño de 400x300 píxeles.
```
# Click Counter
<p align="center">
    <img src="https://i.ibb.co/6JcbZBh/Captura-de-pantalla-2023-08-29-234117.png" alt="imagen" width="400">
</p>

# Linux Distros
<p align="center">
    <img src="https://i.ibb.co/yXtCLHK/225shots-so.png" alt="imagen" width="600">
</p>

