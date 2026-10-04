package d;

import O3.C;
import f.AbstractC0841b;
import f.C0844e;
import g.C0928a;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: d.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0775i extends AbstractC0841b {

    /* renamed from: k, reason: collision with root package name */
    public final C0767a f11181k;

    public C0775i(C0767a c0767a) {
        this.f11181k = c0767a;
    }

    public final void u(L2.e eVar) throws Exception {
        C c2;
        C0844e c0844e = this.f11181k.a;
        if (c0844e != null) {
            c.l lVar = c0844e.f11381k;
            LinkedHashMap linkedHashMap = lVar.f11061b;
            String str = c0844e.f11382l;
            Object obj = linkedHashMap.get(str);
            C0928a c0928a = c0844e.f11383m;
            if (obj == null) {
                throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + c0928a + " and input " + eVar + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
            }
            int iIntValue = ((Number) obj).intValue();
            ArrayList arrayList = lVar.f11063d;
            arrayList.add(str);
            try {
                lVar.b(iIntValue, c0928a, eVar);
                c2 = C.a;
            } catch (Exception e7) {
                arrayList.remove(str);
                throw e7;
            }
        } else {
            c2 = null;
        }
        if (c2 == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }
}
