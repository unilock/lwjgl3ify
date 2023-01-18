package org.lwjglx.opengl;

public class EXTTextureBufferObject {
    public static final int GL_MAX_TEXTURE_BUFFER_SIZE_EXT = 35883;
    public static final int GL_TEXTURE_BINDING_BUFFER_EXT = 35884;
    public static final int GL_TEXTURE_BUFFER_DATA_STORE_BINDING_EXT = 35885;
    public static final int GL_TEXTURE_BUFFER_EXT = 35882;
    public static final int GL_TEXTURE_BUFFER_FORMAT_EXT = 35886;

    public static void glTexBufferEXT(int target, int internalformat, int buffer) {
        org.lwjgl.opengl.EXTTextureBufferObject.glTexBufferEXT(target, internalformat, buffer);
    }
}
