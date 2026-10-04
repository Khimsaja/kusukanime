package H2;

import B1.C0017d;
import K5.Y;
import androidx.lifecycle.G;
import androidx.lifecycle.O;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import u1.AbstractC2067a;

/* renamed from: H2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0245a extends O {

    /* renamed from: b, reason: collision with root package name */
    public final String f3608b = "SaveableStateHolder_BackStackEntryKey";

    /* renamed from: c, reason: collision with root package name */
    public final UUID f3609c;

    /* renamed from: d, reason: collision with root package name */
    public WeakReference f3610d;

    public C0245a(G g4) {
        Object value;
        g4.getClass();
        C0017d c0017d = g4.f10707b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0017d.f318l;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) c0017d.f321o;
        try {
            K5.G g7 = (K5.G) linkedHashMap2.get("SaveableStateHolder_BackStackEntryKey");
            if (g7 == null || (value = ((Y) g7).getValue()) == null) {
                value = linkedHashMap.get("SaveableStateHolder_BackStackEntryKey");
            }
        } catch (ClassCastException unused) {
            linkedHashMap.remove("SaveableStateHolder_BackStackEntryKey");
            ((LinkedHashMap) c0017d.f320n).remove("SaveableStateHolder_BackStackEntryKey");
            linkedHashMap2.remove("SaveableStateHolder_BackStackEntryKey");
            value = null;
        }
        UUID uuidRandomUUID = (UUID) value;
        if (uuidRandomUUID == null) {
            uuidRandomUUID = UUID.randomUUID();
            String str = this.f3608b;
            kotlin.jvm.internal.l.f("key", str);
            if (uuidRandomUUID != null) {
                ArrayList arrayList = AbstractC2067a.a;
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((Class) it.next()).isInstance(uuidRandomUUID)) {
                        }
                    }
                }
                throw new IllegalArgumentException(("Can't put value with type " + uuidRandomUUID.getClass() + " into saved state").toString());
            }
            ArrayList arrayList2 = AbstractC2067a.a;
            g4.a.get(str);
            c0017d.G(str, uuidRandomUUID);
        }
        this.f3609c = uuidRandomUUID;
    }

    @Override // androidx.lifecycle.O
    public final void d() {
        WeakReference weakReference = this.f3610d;
        if (weakReference == null) {
            kotlin.jvm.internal.l.l("saveableStateHolderRef");
            throw null;
        }
        X.c cVar = (X.c) weakReference.get();
        if (cVar != null) {
            cVar.e(this.f3609c);
        }
        WeakReference weakReference2 = this.f3610d;
        if (weakReference2 != null) {
            weakReference2.clear();
        } else {
            kotlin.jvm.internal.l.l("saveableStateHolderRef");
            throw null;
        }
    }
}
