package Q3;

import f4.InterfaceC0881a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class d extends f implements Iterator, InterfaceC0881a {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7968o;

    public d(g gVar, int i7) {
        this.f7968o = i7;
        l.f("map", gVar);
        this.f7975n = gVar;
        this.f7973l = -1;
        this.f7974m = gVar.f7984r;
        c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f7968o) {
            case 0:
                b();
                int i7 = this.f7972k;
                g gVar = (g) this.f7975n;
                if (i7 >= gVar.f7982p) {
                    throw new NoSuchElementException();
                }
                this.f7972k = i7 + 1;
                this.f7973l = i7;
                e eVar = new e(gVar, i7);
                c();
                return eVar;
            case 1:
                b();
                int i8 = this.f7972k;
                g gVar2 = (g) this.f7975n;
                if (i8 >= gVar2.f7982p) {
                    throw new NoSuchElementException();
                }
                this.f7972k = i8 + 1;
                this.f7973l = i8;
                Object obj = gVar2.f7977k[i8];
                c();
                return obj;
            default:
                b();
                int i9 = this.f7972k;
                g gVar3 = (g) this.f7975n;
                if (i9 >= gVar3.f7982p) {
                    throw new NoSuchElementException();
                }
                this.f7972k = i9 + 1;
                this.f7973l = i9;
                Object[] objArr = gVar3.f7978l;
                l.c(objArr);
                Object obj2 = objArr[this.f7973l];
                c();
                return obj2;
        }
    }
}
