package d5;

import P3.r;
import P3.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import u4.InterfaceC2097c;
import x4.C2272S;

/* renamed from: d5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0805a implements w5.a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0805a f11324b = new C0805a(0);
    public final /* synthetic */ int a;

    public /* synthetic */ C0805a(int i7) {
        this.a = i7;
    }

    @Override // w5.a
    public final Iterable c(Object obj) {
        Collection collectionM;
        switch (this.a) {
            case 0:
                int i7 = e.a;
                Collection collectionM2 = ((C2272S) obj).m();
                ArrayList arrayList = new ArrayList(r.p(collectionM2, 10));
                Iterator it = ((ArrayList) collectionM2).iterator();
                while (it.hasNext()) {
                    arrayList.add(((C2272S) it.next()).a());
                }
                return arrayList;
            default:
                InterfaceC2097c interfaceC2097c = (InterfaceC2097c) obj;
                return (interfaceC2097c == null || (collectionM = interfaceC2097c.m()) == null) ? y.f7779k : collectionM;
        }
    }
}
