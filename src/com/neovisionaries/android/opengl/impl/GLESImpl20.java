/*
 * Copyright (C) 2012 Neo Visionaries Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.neovisionaries.android.opengl.impl;


import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import android.opengl.GLES20;
import com.neovisionaries.android.opengl.GLES;


/**
 * An implementation of {@link GLES} interface for OpenGL ES 2.0.
 *
 * <p>
 * Note that the methods below of this class throw
 * UnsupportedOperationException.
 * </p>
 *
 * <ul>
 * <li>glDrawElements(int mode, int count, int type, int offset)
 * <li>glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, int offset)
 * </ul>
 *
 * <p>
 * This is because
 * <a href="http://developer.android.com/reference/android/opengl/GLES20.html"
 * >android.opengl.GLES20</a> class in Android 2.2 does not have
 * the counterpart methods although it should have. {@link
 * GLESImpl20_9} should be used for Android 2.3 and newer.
 * </p>
 *
 * @author Takahiko Kawasaki
 *
 * @see GLESImpl20_9
 * @see <a href="http://developer.android.com/reference/android/opengl/GLES20.html">android.opengl.GLES20</a>
 */
public class GLESImpl20 extends GLESImplBase
{
    @Override
    public int getMajorVersion()
    {
        // OpenGL ES 2.0.
        return 2;
    }


    @Override
    public void glActiveTexture(int textureUnit)
    {
        GLES20.glActiveTexture(textureUnit);
    }


    @Override
    public void glAttachShader(int programId, int shaderId)
    {
        GLES20.glAttachShader(programId, shaderId);
    }


    @Override
    public void glBindAttribLocation(int programId, int attributeIndex, String attributeName)
    {
        GLES20.glBindAttribLocation(programId, attributeIndex, attributeName);
    }


    @Override
    public void glBindBuffer(int vertexBufferType, int vertexBufferId)
    {
        GLES20.glBindBuffer(vertexBufferType, vertexBufferId);
    }


    @Override
    public void glBindRenderbuffer(int target, int renderBufferId)
    {
        GLES20.glBindRenderbuffer(target, renderBufferId);
    }


    @Override
    public void glBindTexture(int textureType, int textureId)
    {
        GLES20.glBindTexture(textureType, textureId);
    }


    @Override
    public void glBlendColor(float red, float green, float blue, float alpha)
    {
        GLES20.glBlendColor(red, green, blue, alpha);
    }


    @Override
    public void glBlendEquation(int operator)
    {
        GLES20.glBlendEquation(operator);
    }


    @Override
    public void glBlendEquationSeparate(int rgbOperator, int alphaOperator)
    {
        GLES20.glBlendEquationSeparate(rgbOperator, alphaOperator);
    }


    @Override
    public void glBlendFunc(int sourceFactor, int destinationFactor)
    {
        GLES20.glBlendFunc(sourceFactor, destinationFactor);
    }


    @Override
    public void glBlendFuncSeparate(int sourceRGBFactor, int destinationRGBFactor, int sourceAlphaFactor, int destinationAlphaFactor)
    {
        GLES20.glBlendFuncSeparate(sourceRGBFactor, destinationRGBFactor, sourceAlphaFactor, destinationAlphaFactor);
    }


    @Override
    public void glBufferData(int vertexBufferType, int size, Buffer data, int vertexBufferUsage)
    {
        GLES20.glBufferData(vertexBufferType, size, data, vertexBufferUsage);
    }


    @Override
    public void glBufferSubData(int vertexBufferType, int offset, int size, Buffer data)
    {
        GLES20.glBufferSubData(vertexBufferType, offset, size, data);
    }


    @Override
    public void glClear(int mask)
    {
        GLES20.glClear(mask);
    }


    @Override
    public void glClearColor(float red, float green, float blue, float alpha)
    {
        GLES20.glClearColor(red, green, blue, alpha);
    }


    @Override
    public void glClearDepthf(float depth)
    {
        GLES20.glClearDepthf(depth);
    }


    @Override
    public void glClearStencil(int stencil)
    {
        GLES20.glClearStencil(stencil);
    }


    @Override
    public void glColorMask(boolean red, boolean green, boolean blue, boolean alpha)
    {
        GLES20.glColorMask(red, green, blue, alpha);
    }


    @Override
    public void glCompileShader(int shaderId)
    {
        GLES20.glCompileShader(shaderId);
    }


    @Override
    public int glCreateProgram()
    {
        return GLES20.glCreateProgram();
    }


    @Override
    public int glCreateShader(int shaderType)
    {
        return GLES20.glCreateShader(shaderType);
    }


    @Override
    public void glDeleteBuffers(int count, int[] vertexBufferIds, int offset)
    {
        GLES20.glDeleteBuffers(count, vertexBufferIds, offset);
    }


    @Override
    public void glDeleteProgram(int programId)
    {
        GLES20.glDeleteProgram(programId);
    }


    @Override
    public void glDeleteRenderbuffers(int count, int[] renderBufferIds, int offset)
    {
        GLES20.glDeleteRenderbuffers(count, renderBufferIds, offset);
    }


    @Override
    public void glDeleteShader(int shaderId)
    {
        GLES20.glDeleteShader(shaderId);
    }


    @Override
    public void glDeleteTextures(int count, int[] textureIds, int offset)
    {
        GLES20.glDeleteTextures(count, textureIds, offset);
    }


    @Override
    public void glDepthMask(boolean writable)
    {
        GLES20.glDepthMask(writable);
    }


    @Override
    public void glDetachShader(int programId, int shaderId)
    {
        GLES20.glDetachShader(programId, shaderId);
    }


    @Override
    public void glDisable(int capability)
    {
        GLES20.glDisable(capability);
    }


    @Override
    public void glDisableVertexAttribArray(int index)
    {
        GLES20.glDisableVertexAttribArray(index);
    }


    @Override
    public void glDrawArrays(int mode, int first, int count)
    {
        GLES20.glDrawArrays(mode, first, count);
    }


    @Override
    public void glDrawElements(int mode, int count, int type, Buffer indices)
    {
        GLES20.glDrawElements(mode, count, type, indices);
    }


    @Override
    public void glEnable(int capability)
    {
        GLES20.glEnable(capability);
    }


    @Override
    public void glEnableVertexAttribArray(int index)
    {
        GLES20.glEnableVertexAttribArray(index);
    }


    @Override
    public void glFinish()
    {
        GLES20.glFinish();
    }


    @Override
    public void glFlush()
    {
        GLES20.glFlush();
    }


    @Override
    public void glGenBuffers(int vertexBufferType, int[] vertexBufferIds, int offset)
    {
        GLES20.glGenBuffers(vertexBufferType, vertexBufferIds, offset);
    }


    @Override
    public void glGenerateMipmap(int textureType)
    {
        GLES20.glGenerateMipmap(textureType);
    }


    @Override
    public void glGenRenderbuffers(int count, int[] renderBufferIds, int offset)
    {
        GLES20.glGenRenderbuffers(count, renderBufferIds, offset);
    }


    @Override
    public void glGenTextures(int textureType, int[] textureIds, int offset)
    {
        GLES20.glGenTextures(textureType, textureIds, offset);
    }


    @Override
    public int glGetAttribLocation(int programId, String attributeName)
    {
        return GLES20.glGetAttribLocation(programId, attributeName);
    }


    @Override
    public void glGetBooleanv(int parameterId, IntBuffer params)
    {
        GLES20.glGetBooleanv(parameterId, params);
    }


    @Override
    public void glGetBooleanv(int parameterId, boolean[] params, int offset)
    {
        GLES20.glGetBooleanv(parameterId, params, offset);
    }


    @Override
    public int glGetError()
    {
        return GLES20.glGetError();
    }


    @Override
    public void glGetFloatv(int parameterId, FloatBuffer params)
    {
        GLES20.glGetFloatv(parameterId, params);
    }


    @Override
    public void glGetFloatv(int parameterId, float[] params, int offset)
    {
        GLES20.glGetFloatv(parameterId, params, offset);
    }


    @Override
    public void glGetIntegerv(int parameterId, IntBuffer params)
    {
        GLES20.glGetIntegerv(parameterId, params);
    }


    @Override
    public void glGetIntegerv(int parameterId, int[] params, int offset)
    {
        GLES20.glGetIntegerv(parameterId, params, offset);
    }


    @Override
    public String glGetProgramInfoLog(int programId)
    {
        return GLES20.glGetProgramInfoLog(programId);
    }


    @Override
    public void glGetProgramiv(int programId, int parameterId, int[] params, int offset)
    {
        GLES20.glGetProgramiv(programId, parameterId, params, offset);
    }


    @Override
    public String glGetShaderInfoLog(int shaderId)
    {
        return GLES20.glGetShaderInfoLog(shaderId);
    }


    @Override
    public void glGetShaderiv(int shaderId, int parameterId, int[] params, int offset)
    {
        GLES20.glGetShaderiv(shaderId, parameterId, params, offset);
    }


    @Override
    public String glGetString(int parameterId)
    {
        return GLES20.glGetString(parameterId);
    }


    @Override
    public void glGetUniformfv(int programId, int uniformLocation, FloatBuffer params)
    {
        GLES20.glGetUniformfv(programId, uniformLocation, params);
    }


    @Override
    public void glGetUniformfv(int programId, int uniformLocation, float[] params, int offset)
    {
        GLES20.glGetUniformfv(programId, uniformLocation, params, offset);
    }


    @Override
    public void glGetUniformiv(int programId, int uniformLocation, IntBuffer params)
    {
        GLES20.glGetUniformiv(programId, uniformLocation, params);
    }


    @Override
    public void glGetUniformiv(int programId, int uniformLocation, int[] params, int offset)
    {
        GLES20.glGetUniformiv(programId, uniformLocation, params, offset);
    }


    @Override
    public int glGetUniformLocation(int programId, String variableName)
    {
        return GLES20.glGetUniformLocation(programId, variableName);
    }


    @Override
    public boolean glIsEnabled(int capability)
    {
        return GLES20.glIsEnabled(capability);
    }


    @Override
    public void glLinkProgram(int programId)
    {
        GLES20.glLinkProgram(programId);
    }


    @Override
    public void glReleaseShaderCompiler()
    {
        GLES20.glReleaseShaderCompiler();
    }


    @Override
    public void glRenderbufferStorage(int target, int internalFormat, int width, int height)
    {
        GLES20.glRenderbufferStorage(target, internalFormat, width, height);
    }


    @Override
    public void glShaderSource(int shaderId, String shaderSourceCode)
    {
        GLES20.glShaderSource(shaderId, shaderSourceCode);
    }


    @Override
    public void glStencilFunc(int comparisonOperator, int referenceValue, int mask)
    {
        GLES20.glStencilFunc(comparisonOperator, referenceValue, mask);
    }


    @Override
    public void glStencilFuncSeparate(int face, int comparisonOperator, int referenceValue, int mask)
    {
        GLES20.glStencilFuncSeparate(face, comparisonOperator, referenceValue, mask);
    }


    @Override
    public void glStencilMask(int stencilMask)
    {
        GLES20.glStencilMask(stencilMask);
    }


    @Override
    public void glStencilMaskSeparate(int face, int stencilMask)
    {
        GLES20.glStencilMaskSeparate(face, stencilMask);
    }


    @Override
    public void glStencilOp(int stencilFail, int depthFail, int pass)
    {
        GLES20.glStencilOp(stencilFail, depthFail, pass);
    }


    @Override
    public void glStencilOpSeparate(int face, int stencilFail, int depthFail, int pass)
    {
        GLES20.glStencilOpSeparate(face, stencilFail, depthFail, pass);
    }


    @Override
    public void glTexParameteri(int textureType, int parameterId, int parameterValue)
    {
        GLES20.glTexParameteri(textureType, parameterId, parameterValue);
    }


    @Override
    public void glUniform1f(int uniformLocation, float x)
    {
        GLES20.glUniform1f(uniformLocation, x);
    }


    @Override
    public void glUniform1fv(int uniformLocation, int count, FloatBuffer values)
    {
        GLES20.glUniform1fv(uniformLocation, count, values);
    }


    @Override
    public void glUniform1fv(int uniformLocation, int count, float[] values, int offset)
    {
        GLES20.glUniform1fv(uniformLocation, count, values, offset);
    }


    @Override
    public void glUniform1i(int uniformLocation, int x)
    {
        GLES20.glUniform1i(uniformLocation, x);
    }


    @Override
    public void glUniform1iv(int uniformLocation, int count, IntBuffer values)
    {
        GLES20.glUniform1iv(uniformLocation, count, values);
    }


    @Override
    public void glUniform1iv(int uniformLocation, int count, int[] values, int offset)
    {
        GLES20.glUniform1iv(uniformLocation, count, values, offset);
    }


    @Override
    public void glUniform2f(int uniformLocation, float x, float y)
    {
        GLES20.glUniform2f(uniformLocation, x, y);
    }


    @Override
    public void glUniform2fv(int uniformLocation, int count, FloatBuffer values)
    {
        GLES20.glUniform2fv(uniformLocation, count, values);
    }


    @Override
    public void glUniform2fv(int uniformLocation, int count, float[] values, int offset)
    {
        GLES20.glUniform2fv(uniformLocation, count, values, offset);
    }


    @Override
    public void glUniform2i(int uniformLocation, int x, int y)
    {
        GLES20.glUniform2i(uniformLocation, x, y);
    }


    @Override
    public void glUniform2iv(int uniformLocation, int count, IntBuffer values)
    {
        GLES20.glUniform2iv(uniformLocation, count, values);
    }


    @Override
    public void glUniform2iv(int uniformLocation, int count, int[] values, int offset)
    {
        GLES20.glUniform2iv(uniformLocation, count, values, offset);
    }


    @Override
    public void glUniform3f(int uniformLocation, float x, float y, float z)
    {
        GLES20.glUniform3f(uniformLocation, x, y, z);
    }


    @Override
    public void glUniform3fv(int uniformLocation, int count, FloatBuffer values)
    {
        GLES20.glUniform3fv(uniformLocation, count, values);
    }


    @Override
    public void glUniform3fv(int uniformLocation, int count, float[] values, int offset)
    {
        GLES20.glUniform3fv(uniformLocation, count, values, offset);
    }


    @Override
    public void glUniform3i(int uniformLocation, int x, int y, int z)
    {
        GLES20.glUniform3i(uniformLocation, x, y, z);
    }


    @Override
    public void glUniform3iv(int uniformLocation, int count, IntBuffer values)
    {
        GLES20.glUniform3iv(uniformLocation, count, values);
    }


    @Override
    public void glUniform3iv(int uniformLocation, int count, int[] values, int offset)
    {
        GLES20.glUniform3iv(uniformLocation, count, values, offset);
    }


    @Override
    public void glUniform4f(int uniformLocation, float x, float y, float z, float w)
    {
        GLES20.glUniform4f(uniformLocation, x, y, z, w);
    }


    @Override
    public void glUniform4fv(int uniformLocation, int count, FloatBuffer values)
    {
        GLES20.glUniform4fv(uniformLocation, count, values);
    }


    @Override
    public void glUniform4fv(int uniformLocation, int count, float[] values, int offset)
    {
        GLES20.glUniform4fv(uniformLocation, count, values, offset);
    }


    @Override
    public void glUniform4i(int uniformLocation, int x, int y, int z, int w)
    {
        GLES20.glUniform4i(uniformLocation, x, y, z, w);
    }


    @Override
    public void glUniform4iv(int uniformLocation, int count, IntBuffer values)
    {
        GLES20.glUniform4iv(uniformLocation, count, values);
    }


    @Override
    public void glUniform4iv(int uniformLocation, int count, int[] values, int offset)
    {
        GLES20.glUniform4iv(uniformLocation, count, values, offset);
    }


    @Override
    public void glUniformMatrix2fv(int uniformLocation, int count, boolean transpose, FloatBuffer values)
    {
        GLES20.glUniformMatrix2fv(uniformLocation, count, transpose, values);
    }


    @Override
    public void glUniformMatrix2fv(int uniformLocation, int count, boolean transpose, float[] values, int offset)
    {
        GLES20.glUniformMatrix2fv(uniformLocation, count, transpose, values, offset);
    }


    @Override
    public void glUniformMatrix3fv(int uniformLocation, int count, boolean transpose, FloatBuffer values)
    {
        GLES20.glUniformMatrix3fv(uniformLocation, count, transpose, values);
    }


    @Override
    public void glUniformMatrix3fv(int uniformLocation, int count, boolean transpose, float[] values, int offset)
    {
        GLES20.glUniformMatrix3fv(uniformLocation, count, transpose, values, offset);
    }


    @Override
    public void glUniformMatrix4fv(int uniformLocation, int count, boolean transpose, FloatBuffer values)
    {
        GLES20.glUniformMatrix4fv(uniformLocation, count, transpose, values);
    }


    @Override
    public void glUniformMatrix4fv(int uniformLocation, int count, boolean transpose, float[] values, int offset)
    {
        GLES20.glUniformMatrix4fv(uniformLocation, count, transpose, values, offset);
    }


    @Override
    public void glUseProgram(int programId)
    {
        GLES20.glUseProgram(programId);
    }


    @Override
    public void glVertexAttrib1f(int vertexAttributeIndex, float x)
    {
        GLES20.glVertexAttrib1f(vertexAttributeIndex, x);
    }


    @Override
    public void glVertexAttrib1fv(int vertexAttributeIndex, FloatBuffer values)
    {
        GLES20.glVertexAttrib1fv(vertexAttributeIndex, values);
    }


    @Override
    public void glVertexAttrib1fv(int vertexAttributeIndex, float[] values, int offset)
    {
        GLES20.glVertexAttrib1fv(vertexAttributeIndex, values, offset);
    }


    @Override
    public void glVertexAttrib2f(int vertexAttributeIndex, float x, float y)
    {
        GLES20.glVertexAttrib2f(vertexAttributeIndex, x, y);
    }


    @Override
    public void glVertexAttrib2fv(int vertexAttributeIndex, FloatBuffer values)
    {
        GLES20.glVertexAttrib2fv(vertexAttributeIndex, values);
    }


    @Override
    public void glVertexAttrib2fv(int vertexAttributeIndex, float[] values, int offset)
    {
        GLES20.glVertexAttrib2fv(vertexAttributeIndex, values, offset);
    }


    @Override
    public void glVertexAttrib3f(int vertexAttributeIndex, float x, float y, float z)
    {
        GLES20.glVertexAttrib3f(vertexAttributeIndex, x, y, z);
    }


    @Override
    public void glVertexAttrib3fv(int vertexAttributeIndex, FloatBuffer values)
    {
        GLES20.glVertexAttrib3fv(vertexAttributeIndex, values);
    }


    @Override
    public void glVertexAttrib3fv(int vertexAttributeIndex, float[] values, int offset)
    {
        GLES20.glVertexAttrib3fv(vertexAttributeIndex, values, offset);
    }


    @Override
    public void glVertexAttrib4f(int vertexAttributeIndex, float x, float y, float z, float w)
    {
        GLES20.glVertexAttrib4f(vertexAttributeIndex, x, y, z, w);
    }


    @Override
    public void glVertexAttrib4fv(int vertexAttributeIndex, FloatBuffer values)
    {
        GLES20.glVertexAttrib4fv(vertexAttributeIndex, values);
    }


    @Override
    public void glVertexAttrib4fv(int vertexAttributeIndex, float[] values, int offset)
    {
        GLES20.glVertexAttrib4fv(vertexAttributeIndex, values, offset);
    }


    @Override
    public void glVertexAttribPointer(int vertexAttributeIndex, int size, int type, boolean normalized, int stride, Buffer ptr)
    {
        GLES20.glVertexAttribPointer(vertexAttributeIndex, size, type, normalized, stride, ptr);
    }


    @Override
    public void glViewport(int x, int y, int width, int height)
    {
        GLES20.glViewport(x, y, width, height);
    }
}
