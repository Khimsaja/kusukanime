package com.kusukanime.data;

import V5.i;
import Z5.o0;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p.AbstractC1755i;
import v.c0;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002#$B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\fJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J%\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0001¢\u0006\u0002\b\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006%"}, d2 = {"Lcom/kusukanime/data/ExpResult;", "", "level", "", "exp", "leveled_up", "", "<init>", "(IIZ)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIIZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getLevel", "()I", "getExp", "getLeveled_up", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_release", "$serializer", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i
/* loaded from: classes.dex */
public final /* data */ class ExpResult {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int exp;
    private final int level;
    private final boolean leveled_up;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/kusukanime/data/ExpResult$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/kusukanime/data/ExpResult;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return ExpResult$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ExpResult() {
        this(0, 0, false, 7, (f) null);
    }

    public static /* synthetic */ ExpResult copy$default(ExpResult expResult, int i7, int i8, boolean z7, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = expResult.level;
        }
        if ((i9 & 2) != 0) {
            i8 = expResult.exp;
        }
        if ((i9 & 4) != 0) {
            z7 = expResult.leveled_up;
        }
        return expResult.copy(i7, i8, z7);
    }

    public static final /* synthetic */ void write$Self$app_release(ExpResult expResult, Y5.b bVar, SerialDescriptor serialDescriptor) {
        if (bVar.z(serialDescriptor) || expResult.level != 1) {
            bVar.q(0, expResult.level, serialDescriptor);
        }
        if (bVar.z(serialDescriptor) || expResult.exp != 0) {
            bVar.q(1, expResult.exp, serialDescriptor);
        }
        if (bVar.z(serialDescriptor) || expResult.leveled_up) {
            bVar.A(serialDescriptor, 2, expResult.leveled_up);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    /* renamed from: component2, reason: from getter */
    public final int getExp() {
        return this.exp;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getLeveled_up() {
        return this.leveled_up;
    }

    public final ExpResult copy(int level, int exp, boolean leveled_up) {
        return new ExpResult(level, exp, leveled_up);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpResult)) {
            return false;
        }
        ExpResult expResult = (ExpResult) other;
        return this.level == expResult.level && this.exp == expResult.exp && this.leveled_up == expResult.leveled_up;
    }

    public final int getExp() {
        return this.exp;
    }

    public final int getLevel() {
        return this.level;
    }

    public final boolean getLeveled_up() {
        return this.leveled_up;
    }

    public int hashCode() {
        return Boolean.hashCode(this.leveled_up) + AbstractC1755i.a(this.exp, Integer.hashCode(this.level) * 31, 31);
    }

    public String toString() {
        int i7 = this.level;
        int i8 = this.exp;
        boolean z7 = this.leveled_up;
        StringBuilder sbB = c0.b("ExpResult(level=", i7, ", exp=", i8, ", leveled_up=");
        sbB.append(z7);
        sbB.append(")");
        return sbB.toString();
    }

    public /* synthetic */ ExpResult(int i7, int i8, int i9, boolean z7, o0 o0Var) {
        this.level = (i7 & 1) == 0 ? 1 : i8;
        if ((i7 & 2) == 0) {
            this.exp = 0;
        } else {
            this.exp = i9;
        }
        if ((i7 & 4) == 0) {
            this.leveled_up = false;
        } else {
            this.leveled_up = z7;
        }
    }

    public ExpResult(int i7, int i8, boolean z7) {
        this.level = i7;
        this.exp = i8;
        this.leveled_up = z7;
    }

    public /* synthetic */ ExpResult(int i7, int i8, boolean z7, int i9, f fVar) {
        this((i9 & 1) != 0 ? 1 : i7, (i9 & 2) != 0 ? 0 : i8, (i9 & 4) != 0 ? false : z7);
    }
}
