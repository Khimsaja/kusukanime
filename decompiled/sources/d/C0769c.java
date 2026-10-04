package d;

import e4.InterfaceC0821a;
import java.util.UUID;

/* renamed from: d.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0769c extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: m, reason: collision with root package name */
    public static final C0769c f11173m = new C0769c(0, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final C0769c f11174n = new C0769c(0, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final C0769c f11175o = new C0769c(0, 2);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f11176l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0769c(int i7, int i8) {
        super(i7);
        this.f11176l = i8;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f11176l) {
            case 0:
                return UUID.randomUUID().toString();
            case 1:
                return null;
            default:
                return null;
        }
    }
}
