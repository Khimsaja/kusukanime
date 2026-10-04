package Z3;

import e4.InterfaceC0821a;
import e4.k;
import java.io.File;
import java.util.Iterator;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class h implements y5.h {
    public final /* synthetic */ int a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10261b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10262c;

    public h(File file) {
        i iVar = i.f10263k;
        this.f10261b = file;
        this.f10262c = iVar;
    }

    @Override // y5.h
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new f(this);
            case 1:
                return new U.c(this);
            default:
                return new y5.e(this);
        }
    }

    public h(y5.h hVar, k kVar) {
        l.f("sequence", hVar);
        this.f10261b = hVar;
        this.f10262c = kVar;
    }

    public h(InterfaceC0821a interfaceC0821a, k kVar) {
        l.f("getNextValue", kVar);
        this.f10261b = interfaceC0821a;
        this.f10262c = kVar;
    }
}
