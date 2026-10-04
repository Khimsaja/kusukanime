package m6;

import java.io.IOException;

/* loaded from: classes.dex */
public final class m extends i6.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f13035e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f13036f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f13037g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, n nVar, int i7, long j7) {
        super(str, true);
        this.f13035e = nVar;
        this.f13036f = i7;
        this.f13037g = j7;
    }

    @Override // i6.a
    public final long a() throws IOException {
        n nVar = this.f13035e;
        try {
            nVar.f13044G.v(this.f13036f, this.f13037g);
            return -1L;
        } catch (IOException e7) {
            nVar.b(2, 2, e7);
            return -1L;
        }
    }
}
