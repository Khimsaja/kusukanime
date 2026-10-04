package io.ktor.utils.io;

import e4.k;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12193k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ByteChannel f12194l;

    public /* synthetic */ a(ByteChannel byteChannel, int i7) {
        this.f12193k = i7;
        this.f12194l = byteChannel;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f12193k) {
            case 0:
                return ByteChannelUtilsKt.attachJob$lambda$0(this.f12194l, (Throwable) obj);
            case 1:
                return ByteReadChannelOperationsKt.reader$lambda$6$lambda$5(this.f12194l, (Throwable) obj);
            default:
                return ByteWriteChannelOperationsKt.writer$lambda$2$lambda$1(this.f12194l, (Throwable) obj);
        }
    }
}
