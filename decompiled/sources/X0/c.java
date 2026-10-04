package X0;

import e4.InterfaceC0821a;
import java.util.UUID;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: m, reason: collision with root package name */
    public static final c f9701m = new c(0, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final c f9702n = new c(0, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final c f9703o = new c(0, 2);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f9704l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i7, int i8) {
        super(i7);
        this.f9704l = i8;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f9704l) {
        }
        return UUID.randomUUID();
    }
}
