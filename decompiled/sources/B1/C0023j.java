package B1;

import C2.C0034g;
import android.opengl.GLES20;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import m5.C1521j;
import u4.InterfaceC2106l;
import u4.Q;

/* renamed from: B1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0023j implements C2.E, K4.e {

    /* renamed from: k, reason: collision with root package name */
    public final int f336k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f337l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f338m;

    /* renamed from: n, reason: collision with root package name */
    public final Cloneable f339n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f340o;

    public C0023j(A2.b bVar, InterfaceC2106l interfaceC2106l, N4.e eVar, int i7) {
        kotlin.jvm.internal.l.f("c", bVar);
        kotlin.jvm.internal.l.f("typeParameterOwner", eVar);
        this.f337l = bVar;
        this.f338m = interfaceC2106l;
        this.f336k = i7;
        ArrayList typeParameters = eVar.getTypeParameters();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = typeParameters.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i8));
            i8++;
        }
        this.f339n = linkedHashMap;
        this.f340o = ((K4.a) ((A2.b) this.f337l).f110l).a.c(new A4.j(6, this));
    }

    public static void d(String str, int i7, int i8) throws C0024k {
        int iGlCreateShader = GLES20.glCreateShader(i8);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        AbstractC0015b.e(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str, iArr[0] == 1);
        GLES20.glAttachShader(i7, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        AbstractC0015b.d();
    }

    @Override // K4.e
    public Q a(A4.D d4) {
        kotlin.jvm.internal.l.f("javaTypeParameter", d4);
        L4.E e7 = (L4.E) ((C1521j) this.f340o).invoke(d4);
        return e7 != null ? e7 : ((K4.e) ((A2.b) this.f337l).f111m).a(d4);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c8  */
    @Override // C2.E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(B1.B r30) {
        /*
            Method dump skipped, instructions count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.C0023j.b(B1.B):void");
    }

    public int e(String str) throws C0024k {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f336k, str);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        AbstractC0015b.d();
        return iGlGetAttribLocation;
    }

    public C0023j(String str, String str2) throws C0024k {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f336k = iGlCreateProgram;
        AbstractC0015b.d();
        d(str, iGlCreateProgram, 35633);
        d(str2, iGlCreateProgram, 35632);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        AbstractC0015b.e("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(iGlCreateProgram);
        this.f339n = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f337l = new A.e[iArr2[0]];
        for (int i7 = 0; i7 < iArr2[0]; i7++) {
            int i8 = this.f336k;
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(i8, 35722, iArr3, 0);
            int i9 = iArr3[0];
            byte[] bArr = new byte[i9];
            GLES20.glGetActiveAttrib(i8, i7, i9, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            int i10 = 0;
            while (true) {
                if (i10 >= i9) {
                    break;
                }
                if (bArr[i10] == 0) {
                    i9 = i10;
                    break;
                }
                i10++;
            }
            String str3 = new String(bArr, 0, i9);
            GLES20.glGetAttribLocation(i8, str3);
            A.e eVar = new A.e(1);
            ((A.e[]) this.f337l)[i7] = eVar;
            ((HashMap) this.f339n).put(str3, eVar);
        }
        this.f340o = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.f336k, 35718, iArr4, 0);
        this.f338m = new A.e[iArr4[0]];
        for (int i11 = 0; i11 < iArr4[0]; i11++) {
            int i12 = this.f336k;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i12, 35719, iArr5, 0);
            int i13 = iArr5[0];
            byte[] bArr2 = new byte[i13];
            GLES20.glGetActiveUniform(i12, i11, i13, new int[1], 0, new int[1], 0, new int[1], 0, bArr2, 0);
            int i14 = 0;
            while (true) {
                if (i14 >= i13) {
                    break;
                }
                if (bArr2[i14] == 0) {
                    i13 = i14;
                    break;
                }
                i14++;
            }
            String str4 = new String(bArr2, 0, i13);
            GLES20.glGetUniformLocation(i12, str4);
            A.e eVar2 = new A.e(2);
            ((A.e[]) this.f338m)[i11] = eVar2;
            ((HashMap) this.f340o).put(str4, eVar2);
        }
        AbstractC0015b.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0023j(V1.y yVar, C0034g c0034g, byte[] bArr, C0020g[] c0020gArr, int i7) {
        this.f337l = yVar;
        this.f338m = c0034g;
        this.f339n = bArr;
        this.f340o = c0020gArr;
        this.f336k = i7;
    }

    public C0023j(C2.I i7, int i8) {
        this.f340o = i7;
        this.f337l = new A(new byte[5], 5);
        this.f338m = new SparseArray();
        this.f339n = new SparseIntArray();
        this.f336k = i8;
    }

    @Override // C2.E
    public void c(H h7, V1.p pVar, C2.K k7) {
    }
}
