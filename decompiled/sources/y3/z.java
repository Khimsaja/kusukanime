package y3;

import O.Z;
import androidx.media3.exoplayer.ExoPlayer;
import s.c1;
import s0.C1955C;
import s3.T;

/* loaded from: classes.dex */
public final class z extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f18367k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f18368l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ExoPlayer f18369m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Z f18370n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ExoPlayer exoPlayer, Z z7, S3.c cVar) {
        super(2, cVar);
        this.f18369m = exoPlayer;
        this.f18370n = z7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        z zVar = new z(this.f18369m, this.f18370n, cVar);
        zVar.f18368l = obj;
        return zVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((C1955C) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1955C c1955c = (C1955C) this.f18368l;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f18367k;
        if (i7 == 0) {
            P3.r.Y(obj);
            io.github.jan.supabase.auth.d dVar = new io.github.jan.supabase.auth.d(c1955c, this.f18369m, this.f18370n, 7);
            T t7 = new T(13);
            this.f18368l = null;
            this.f18367k = 1;
            if (c1.d(c1955c, dVar, t7, this, 6) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
        }
        return O3.C.a;
    }
}
