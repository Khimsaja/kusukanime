package c;

import B1.C0017d;
import K5.G;
import K5.Y;
import P3.E;
import android.os.Bundle;
import f1.AbstractC0870c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: c.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0743e implements L2.d {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11054b;

    public /* synthetic */ C0743e(int i7, Object obj) {
        this.a = i7;
        this.f11054b = obj;
    }

    @Override // L2.d
    public final Bundle a() {
        O3.l[] lVarArr;
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                l lVar = ((n) this.f11054b).f11079r;
                lVar.getClass();
                LinkedHashMap linkedHashMap = lVar.f11061b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(lVar.f11063d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(lVar.f11066g));
                return bundle;
            case 1:
                C0017d c0017d = (C0017d) this.f11054b;
                for (Map.Entry entry : E.s0((LinkedHashMap) c0017d.f321o).entrySet()) {
                    c0017d.G((String) entry.getKey(), ((Y) ((G) entry.getValue())).getValue());
                }
                for (Map.Entry entry2 : E.s0((LinkedHashMap) c0017d.f319m).entrySet()) {
                    c0017d.G((String) entry2.getKey(), ((L2.d) entry2.getValue()).a());
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) c0017d.f318l;
                if (linkedHashMap2.isEmpty()) {
                    lVarArr = new O3.l[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                        arrayList.add(new O3.l((String) entry3.getKey(), entry3.getValue()));
                    }
                    lVarArr = (O3.l[]) arrayList.toArray(new O3.l[0]);
                }
                return AbstractC0870c.H((O3.l[]) Arrays.copyOf(lVarArr, lVarArr.length));
            default:
                Map mapA = ((X.k) this.f11054b).a();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry4 : ((LinkedHashMap) mapA).entrySet()) {
                    String str = (String) entry4.getKey();
                    List list = (List) entry4.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle2;
        }
    }
}
