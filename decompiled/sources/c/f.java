package c;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.B;

/* loaded from: classes.dex */
public final /* synthetic */ class f {
    public final /* synthetic */ n a;

    public /* synthetic */ f(n nVar) {
        this.a = nVar;
    }

    public final void a(n nVar) {
        kotlin.jvm.internal.l.f("it", nVar);
        n nVar2 = this.a;
        Bundle bundleT = ((F.w) nVar2.f11075n.f6046m).t("android:support:activity-result");
        if (bundleT != null) {
            l lVar = nVar2.f11079r;
            lVar.getClass();
            ArrayList<Integer> integerArrayList = bundleT.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleT.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleT.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                lVar.f11063d.addAll(stringArrayList2);
            }
            Bundle bundle = bundleT.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            Bundle bundle2 = lVar.f11066g;
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            int size = stringArrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                String str = stringArrayList.get(i7);
                LinkedHashMap linkedHashMap = lVar.f11061b;
                boolean zContainsKey = linkedHashMap.containsKey(str);
                LinkedHashMap linkedHashMap2 = lVar.a;
                if (zContainsKey) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle2.containsKey(str)) {
                        B.c(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i7);
                kotlin.jvm.internal.l.e("rcs[i]", num2);
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i7);
                kotlin.jvm.internal.l.e("keys[i]", str2);
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                linkedHashMap.put(str3, Integer.valueOf(iIntValue));
            }
        }
    }
}
