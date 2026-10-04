package D4;

/* loaded from: classes.dex */
public abstract class D extends L {
    public abstract Object a();

    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('(');
        if (this instanceof G) {
            string = "\"" + ((Object) ((G) this).a) + '\"';
        } else {
            string = a().toString();
        }
        return A6.b.j(sb, string, ')');
    }
}
