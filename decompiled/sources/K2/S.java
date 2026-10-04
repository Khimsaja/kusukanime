package K2;

import b1.AbstractC0703b;

/* loaded from: classes.dex */
public final class S {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f4500b;

    /* renamed from: c, reason: collision with root package name */
    public int f4501c;

    /* renamed from: d, reason: collision with root package name */
    public int f4502d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4503e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4504f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4505g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4506h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4507i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4508j;

    /* renamed from: k, reason: collision with root package name */
    public int f4509k;

    /* renamed from: l, reason: collision with root package name */
    public long f4510l;

    /* renamed from: m, reason: collision with root package name */
    public int f4511m;

    public final void a(int i7) {
        if ((this.f4501c & i7) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i7) + " but it is " + Integer.toBinaryString(this.f4501c));
    }

    public final int b() {
        return this.f4504f ? this.a - this.f4500b : this.f4502d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State{mTargetPosition=-1, mData=null, mItemCount=");
        sb.append(this.f4502d);
        sb.append(", mIsMeasuring=");
        sb.append(this.f4506h);
        sb.append(", mPreviousLayoutItemCount=");
        sb.append(this.a);
        sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        sb.append(this.f4500b);
        sb.append(", mStructureChanged=");
        sb.append(this.f4503e);
        sb.append(", mInPreLayout=");
        sb.append(this.f4504f);
        sb.append(", mRunSimpleAnimations=");
        sb.append(this.f4507i);
        sb.append(", mRunPredictiveAnimations=");
        return AbstractC0703b.n(sb, this.f4508j, '}');
    }
}
