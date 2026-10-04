package X2;

import android.webkit.MimeTypeMap;
import java.io.File;
import p.I0;
import w6.o;
import w6.y;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public final class h implements g {
    public final File a;

    public h(File file) {
        this.a = file;
    }

    @Override // X2.g
    public final Object a(S3.c cVar) {
        String str = y.f17190l;
        File file = this.a;
        U2.l lVar = new U2.l(I0.u(file), o.f17171k, null, null);
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String name = file.getName();
        kotlin.jvm.internal.l.e("getName(...)", name);
        return new m(lVar, singleton.getMimeTypeFromExtension(AbstractC2510o.C0('.', name, "")), U2.e.f9206m);
    }
}
