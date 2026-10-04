package z0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class K0 implements y0.f0 {

    /* renamed from: k, reason: collision with root package name */
    public final int f18636k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f18637l;

    /* renamed from: m, reason: collision with root package name */
    public Float f18638m = null;

    /* renamed from: n, reason: collision with root package name */
    public Float f18639n = null;

    /* renamed from: o, reason: collision with root package name */
    public F0.g f18640o = null;

    /* renamed from: p, reason: collision with root package name */
    public F0.g f18641p = null;

    public K0(int i7, ArrayList arrayList) {
        this.f18636k = i7;
        this.f18637l = arrayList;
    }

    @Override // y0.f0
    public final boolean z() {
        return this.f18637l.contains(this);
    }
}
