package io.ktor.util;

import e4.k;
import io.ktor.utils.io.ByteChannel;
import io.ktor.utils.io.ByteWriteChannel;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import kotlin.jvm.internal.v;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12184k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f12185l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f12186m;

    public /* synthetic */ a(int i7, Object obj, Object obj2) {
        this.f12184k = i7;
        this.f12185l = obj;
        this.f12186m = obj2;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f12184k) {
            case 0:
                return CryptoKt__CryptoJvmKt.getDigestFunction$lambda$0$CryptoKt__CryptoJvmKt((String) this.f12185l, (k) this.f12186m, (String) obj);
            case 1:
                return BufferViewJvmKt.write$lambda$1((v) this.f12185l, (WritableByteChannel) this.f12186m, (ByteBuffer) obj);
            case 2:
                return BufferViewJvmKt.read$lambda$0((v) this.f12185l, (ReadableByteChannel) this.f12186m, (ByteBuffer) obj);
            case 3:
                return ByteChannelsKt.copyToBoth$lambda$1((ByteWriteChannel) this.f12185l, (ByteWriteChannel) this.f12186m, (Throwable) obj);
            default:
                return ByteChannelsKt.split$lambda$0((ByteChannel) this.f12185l, (ByteChannel) this.f12186m, (Throwable) obj);
        }
    }
}
