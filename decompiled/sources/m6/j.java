package m6;

import b1.AbstractC0703b;
import java.io.IOException;

/* loaded from: classes.dex */
public final class j extends i6.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f13024e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f13025f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f13026g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f13027h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, n nVar, int i7, int i8, int i9) {
        super(str, true);
        this.f13024e = i9;
        this.f13025f = nVar;
        this.f13026g = i7;
        this.f13027h = i8;
    }

    @Override // i6.a
    public final long a() throws IOException {
        switch (this.f13024e) {
            case 0:
                int i7 = this.f13026g;
                int i8 = this.f13027h;
                n nVar = this.f13025f;
                nVar.getClass();
                try {
                    nVar.f13044G.m(i7, i8, true);
                    return -1L;
                } catch (IOException e7) {
                    nVar.b(2, 2, e7);
                    return -1L;
                }
            case 1:
                z zVar = this.f13025f.f13056u;
                int i9 = this.f13027h;
                zVar.getClass();
                AbstractC0703b.w(i9, "errorCode");
                synchronized (this.f13025f) {
                    this.f13025f.I.remove(Integer.valueOf(this.f13026g));
                }
                return -1L;
            default:
                n nVar2 = this.f13025f;
                try {
                    int i10 = this.f13026g;
                    int i11 = this.f13027h;
                    nVar2.getClass();
                    AbstractC0703b.w(i11, "statusCode");
                    nVar2.f13044G.s(i10, i11);
                    return -1L;
                } catch (IOException e8) {
                    nVar2.b(2, 2, e8);
                    return -1L;
                }
        }
    }
}
