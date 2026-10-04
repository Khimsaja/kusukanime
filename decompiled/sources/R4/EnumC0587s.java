package R4;

import X4.InterfaceC0619p;

/* renamed from: R4.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0587s implements InterfaceC0619p {
    RETURNS_CONSTANT(0),
    CALLS(1),
    RETURNS_NOT_NULL(2);


    /* renamed from: k, reason: collision with root package name */
    public final int f8608k;

    EnumC0587s(int i7) {
        this.f8608k = i7;
    }

    @Override // X4.InterfaceC0619p
    public final int a() {
        return this.f8608k;
    }
}
