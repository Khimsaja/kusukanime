package X4;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/* loaded from: classes.dex */
public final class z implements Iterator {

    /* renamed from: k, reason: collision with root package name */
    public final Stack f9917k = new Stack();

    /* renamed from: l, reason: collision with root package name */
    public v f9918l;

    public z(AbstractC0608e abstractC0608e) {
        while (abstractC0608e instanceof B) {
            B b4 = (B) abstractC0608e;
            this.f9917k.push(b4);
            abstractC0608e = b4.f9833m;
        }
        this.f9918l = (v) abstractC0608e;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final v next() {
        v vVar;
        v vVar2 = this.f9918l;
        if (vVar2 == null) {
            throw new NoSuchElementException();
        }
        while (true) {
            Stack stack = this.f9917k;
            if (!stack.isEmpty()) {
                Object obj = ((B) stack.pop()).f9834n;
                while (obj instanceof B) {
                    B b4 = (B) obj;
                    stack.push(b4);
                    obj = b4.f9833m;
                }
                vVar = (v) obj;
                if (vVar.f9913l.length != 0) {
                    break;
                }
            } else {
                vVar = null;
                break;
            }
        }
        this.f9918l = vVar;
        return vVar2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9918l != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
