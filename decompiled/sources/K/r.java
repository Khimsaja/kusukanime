package K;

import android.content.Context;
import android.view.ViewGroup;
import com.kusukanime.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class r extends ViewGroup {

    /* renamed from: k, reason: collision with root package name */
    public final int f4411k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f4412l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f4413m;

    /* renamed from: n, reason: collision with root package name */
    public final F.w f4414n;

    /* renamed from: o, reason: collision with root package name */
    public int f4415o;

    public r(Context context) {
        super(context);
        this.f4411k = 5;
        ArrayList arrayList = new ArrayList();
        this.f4412l = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f4413m = arrayList2;
        this.f4414n = new F.w(23);
        setClipChildren(false);
        t tVar = new t(context);
        addView(tVar);
        arrayList.add(tVar);
        arrayList2.add(tVar);
        this.f4415o = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final t a(s sVar) {
        F.w wVar = this.f4414n;
        t tVar = (t) ((LinkedHashMap) wVar.f2037l).get(sVar);
        if (tVar != null) {
            return tVar;
        }
        ArrayList arrayList = this.f4413m;
        kotlin.jvm.internal.l.f("<this>", arrayList);
        t tVar2 = (t) (arrayList.isEmpty() ? null : arrayList.remove(0));
        LinkedHashMap linkedHashMap = (LinkedHashMap) wVar.f2037l;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) wVar.f2038m;
        if (tVar2 == null) {
            int i7 = this.f4415o;
            ArrayList arrayList2 = this.f4412l;
            if (i7 > P3.r.y(arrayList2)) {
                tVar2 = new t(getContext());
                addView(tVar2);
                arrayList2.add(tVar2);
            } else {
                tVar2 = (t) arrayList2.get(this.f4415o);
                s sVar2 = (s) linkedHashMap2.get(tVar2);
                if (sVar2 != null) {
                    sVar2.i0();
                    t tVar3 = (t) linkedHashMap.get(sVar2);
                    if (tVar3 != null) {
                    }
                    linkedHashMap.remove(sVar2);
                    tVar2.c();
                }
            }
            int i8 = this.f4415o;
            if (i8 < this.f4411k - 1) {
                this.f4415o = i8 + 1;
            } else {
                this.f4415o = 0;
            }
        }
        linkedHashMap.put(sVar, tVar2);
        linkedHashMap2.put(tVar2, sVar);
        return tVar2;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
    }
}
