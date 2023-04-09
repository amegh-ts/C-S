import java.awt.*;
import java.applet.*;

public class RectangleEx extends Applet {
    public void paint(Graphics g) {
        int m = Integer.parseInt(getParameter("x"));
        int n = Integer.parseInt(getParameter("y"));
        int p = Integer.parseInt(getParameter("l"));
        int q = Integer.parseInt(getParameter("w"));
        g.setColor(Color.blue);
        g.drawRect(m, n, p, q);
    }
}
<html>
<body>
<APPLET Code="RectangleEx.class" WIDTH=400 HEIGHT=400>
<PARAM NAME="x" VALUE="208">
<PARAM NAME="y" VALUE="108">
<PARAM NAME="l" VALUE="200">
<PARAM NAME="w" VALUE="100">
</APPLET>
</body>
</html>
