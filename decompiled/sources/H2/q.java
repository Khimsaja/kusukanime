package H2;

import G2.C0174k;
import G2.C0176m;
import G2.E;
import G2.O;
import android.os.Bundle;
import android.os.Parcelable;
import b1.AbstractC0703b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public static final q f3634l = new q(2);

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        Bundle bundle;
        E e7 = (E) obj2;
        e7.getClass();
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : P3.E.s0(e7.f2653v.a).entrySet()) {
            ((O) entry.getValue()).getClass();
        }
        if (arrayList.isEmpty()) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        }
        P3.l lVar = e7.f2638g;
        if (!lVar.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[lVar.f7767m];
            Iterator<E> it = lVar.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                parcelableArr[i7] = new C0176m((C0174k) it.next());
                i7++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        LinkedHashMap linkedHashMap = e7.f2644m;
        if (!linkedHashMap.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[linkedHashMap.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i8 = 0;
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                int iIntValue = ((Number) entry2.getKey()).intValue();
                String str = (String) entry2.getValue();
                iArr[i8] = iIntValue;
                arrayList2.add(str);
                i8++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        LinkedHashMap linkedHashMap2 = e7.f2645n;
        if (!linkedHashMap2.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                String str2 = (String) entry3.getKey();
                P3.l lVar2 = (P3.l) entry3.getValue();
                arrayList3.add(str2);
                Parcelable[] parcelableArr2 = new Parcelable[lVar2.f7767m];
                Iterator it2 = lVar2.iterator();
                int i9 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        P3.r.X();
                        throw null;
                    }
                    parcelableArr2[i9] = (C0176m) next;
                    i9 = i10;
                }
                bundle.putParcelableArray(AbstractC0703b.i("android-support-nav:controller:backStackStates:", str2), parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (e7.f2637f) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", e7.f2637f);
        }
        return bundle;
    }
}
