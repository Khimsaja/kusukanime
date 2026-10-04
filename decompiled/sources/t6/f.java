package t6;

import java.io.IOException;
import java.net.SocketTimeoutException;
import w6.l;

/* loaded from: classes.dex */
public final class f extends i6.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f16158e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f16159f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, g gVar, long j7) {
        super(str, true);
        this.f16158e = gVar;
        this.f16159f = j7;
    }

    @Override // i6.a
    public final long a() {
        j jVar;
        g gVar = this.f16158e;
        synchronized (gVar) {
            try {
                if (!gVar.f16179t && (jVar = gVar.f16169j) != null) {
                    int i7 = gVar.f16181v ? gVar.f16180u : -1;
                    gVar.f16180u++;
                    gVar.f16181v = true;
                    if (i7 != -1) {
                        gVar.c(new SocketTimeoutException("sent ping but didn't receive pong within " + gVar.f16162c + "ms (after " + (i7 - 1) + " successful ping/pongs)"), null);
                    } else {
                        try {
                            l lVar = l.f17157n;
                            kotlin.jvm.internal.l.f("payload", lVar);
                            jVar.b(9, lVar);
                        } catch (IOException e7) {
                            gVar.c(e7, null);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f16159f;
    }
}
