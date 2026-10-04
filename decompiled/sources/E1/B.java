package E1;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class B implements h {

    /* renamed from: k, reason: collision with root package name */
    public final h f1836k;

    /* renamed from: l, reason: collision with root package name */
    public long f1837l;

    /* renamed from: m, reason: collision with root package name */
    public Uri f1838m;

    public B(h hVar) {
        hVar.getClass();
        this.f1836k = hVar;
        this.f1838m = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    @Override // E1.h
    public final void close() {
        this.f1836k.close();
    }

    @Override // E1.h
    public final Map d() {
        return this.f1836k.d();
    }

    @Override // E1.h
    public final long g(k kVar) {
        h hVar = this.f1836k;
        this.f1838m = kVar.a;
        Map map = Collections.EMPTY_MAP;
        try {
            return hVar.g(kVar);
        } finally {
            Uri uri = hVar.getUri();
            if (uri != null) {
                this.f1838m = uri;
            }
            hVar.d();
        }
    }

    @Override // E1.h
    public final Uri getUri() {
        return this.f1836k.getUri();
    }

    @Override // E1.h
    public final void j(D d4) {
        d4.getClass();
        this.f1836k.j(d4);
    }

    @Override // y1.InterfaceC2385g
    public final int o(byte[] bArr, int i7, int i8) {
        int iO = this.f1836k.o(bArr, i7, i8);
        if (iO != -1) {
            this.f1837l += iO;
        }
        return iO;
    }
}
