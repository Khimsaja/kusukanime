package y0;

import e4.InterfaceC0821a;
import java.util.LinkedHashMap;

/* renamed from: y0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2362i extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: m, reason: collision with root package name */
    public static final C2362i f17865m = new C2362i(0, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final C2362i f17866n = new C2362i(0, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final C2362i f17867o = new C2362i(0, 2);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f17868l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2362i(int i7, int i8) {
        super(i7);
        this.f17868l = i8;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f17868l) {
            case 0:
                return new C2349D(2);
            case 1:
                return new LinkedHashMap();
            default:
                return new C2349D(3);
        }
    }
}
