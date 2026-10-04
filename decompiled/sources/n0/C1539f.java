package n0;

import android.graphics.PathMeasure;
import e4.InterfaceC0821a;
import h0.C0988k;

/* renamed from: n0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1539f extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: m, reason: collision with root package name */
    public static final C1539f f13164m = new C1539f(0, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final C1539f f13165n = new C1539f(0, 1);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f13166l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1539f(int i7, int i8) {
        super(i7);
        this.f13166l = i8;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f13166l) {
            case 0:
                return new C0988k(new PathMeasure());
            default:
                return O3.C.a;
        }
    }
}
