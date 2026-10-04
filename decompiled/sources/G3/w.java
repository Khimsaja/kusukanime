package G3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class w {
    public final ArrayList a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f2859b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public boolean f2860c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f2861d;

    public w(x xVar) {
        this.f2861d = xVar;
    }

    public final IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        if (!this.f2860c) {
            this.f2860c = true;
            ArrayDeque arrayDeque = this.f2859b;
            if (arrayDeque.size() != 1 || ((v) arrayDeque.getFirst()).f2856b != null) {
                StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
                Iterator itDescendingIterator = arrayDeque.descendingIterator();
                while (itDescendingIterator.hasNext()) {
                    v vVar = (v) itDescendingIterator.next();
                    sb.append("\nfor ");
                    sb.append(vVar.a);
                    String str = vVar.f2856b;
                    if (str != null) {
                        sb.append(' ');
                        sb.append(str);
                    }
                }
                return new IllegalArgumentException(sb.toString(), illegalArgumentException);
            }
        }
        return illegalArgumentException;
    }

    public final void b(boolean z7) {
        this.f2859b.removeLast();
        if (this.f2859b.isEmpty()) {
            this.f2861d.f2863b.remove();
            if (z7) {
                synchronized (this.f2861d.f2864c) {
                    try {
                        int size = this.a.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            v vVar = (v) this.a.get(i7);
                            j jVar = (j) this.f2861d.f2864c.put(vVar.f2857c, vVar.f2858d);
                            if (jVar != null) {
                                vVar.f2858d = jVar;
                                this.f2861d.f2864c.put(vVar.f2857c, jVar);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }
}
