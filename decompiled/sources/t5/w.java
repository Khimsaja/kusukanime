package t5;

import b1.AbstractC0703b;

/* loaded from: classes.dex */
public final class w extends n {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16144c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final int f16145d;

    /* JADX WARN: Illegal instructions before constructor call */
    public w(int i7) {
        StringBuilder sbP = AbstractC0703b.p(i7, "must have at least ", " value parameter");
        sbP.append(i7 > 1 ? "s" : "");
        super(sbP.toString(), 1);
        this.f16145d = i7;
    }

    @Override // t5.e
    public final boolean b(J4.f fVar) {
        switch (this.f16144c) {
            case 0:
                if (fVar.m0().size() >= this.f16145d) {
                }
                break;
            default:
                if (fVar.m0().size() == this.f16145d) {
                }
                break;
        }
        return false;
    }

    public w() {
        super("must have exactly 2 value parameters", 1);
        this.f16145d = 2;
    }
}
