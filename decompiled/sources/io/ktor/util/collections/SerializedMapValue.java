package io.ktor.util.collections;

import e4.k;
import io.ktor.utils.io.InternalAPI;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@InternalAPI
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lio/ktor/util/collections/SerializedMapValue;", "T", "", "", "key", "Lkotlin/Function1;", "serialize", "deserialize", "<init>", "(Ljava/lang/String;Le4/k;Le4/k;)V", "Ljava/lang/String;", "getKey$ktor_utils", "()Ljava/lang/String;", "Le4/k;", "getSerialize$ktor_utils", "()Le4/k;", "getDeserialize$ktor_utils", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SerializedMapValue<T> {
    private final k deserialize;
    private final String key;
    private final k serialize;

    public SerializedMapValue(String str, k kVar, k kVar2) {
        l.f("key", str);
        l.f("serialize", kVar);
        l.f("deserialize", kVar2);
        this.key = str;
        this.serialize = kVar;
        this.deserialize = kVar2;
    }

    /* renamed from: getDeserialize$ktor_utils, reason: from getter */
    public final k getDeserialize() {
        return this.deserialize;
    }

    /* renamed from: getKey$ktor_utils, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: getSerialize$ktor_utils, reason: from getter */
    public final k getSerialize() {
        return this.serialize;
    }
}
