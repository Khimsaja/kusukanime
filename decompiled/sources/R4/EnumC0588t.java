package R4;

import X4.InterfaceC0619p;

/* renamed from: R4.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0588t implements InterfaceC0619p {
    AT_MOST_ONCE(0),
    EXACTLY_ONCE(1),
    AT_LEAST_ONCE(2);


    /* renamed from: k, reason: collision with root package name */
    public final int f8613k;

    EnumC0588t(int i7) {
        this.f8613k = i7;
    }

    @Override // X4.InterfaceC0619p
    public final int a() {
        return this.f8613k;
    }
}
